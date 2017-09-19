package com.drnsmltr.quadrocopterremote.activities;

import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.reiss.yanneck.quadcopterremote.R;
import com.drnsmltr.quadrocopterremote.fragments.BroadcastSearchFragment;
import com.drnsmltr.quadrocopterremote.fragments.ConnectionFragment;
import com.drnsmltr.quadrocopterremote.networking.NetworkManagerUDP;

import dji.common.error.DJIError;
import dji.common.error.DJISDKError;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIBaseProduct;
import dji.sdk.sdkmanager.DJISDKManager;

/**
 * MainActivity, used to implement the rebuilt DJI Mobile SDK activition
 */
public class MainActivity extends AppCompatActivity
{
    private static final String TAG = MainActivity.class.getName();
    public static final String FLAG_CONNECTION_CHANGE = "dji_sdk_connection_change";
    private static DJIBaseProduct _product;
    private Handler _handler;
    private final int SIMULATOR_UDP_PORT = 13000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        // Turn off titlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Benötigt, damit man die Broadcasts empfangen kann
        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        // Fullscreen mode
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        // Initialize DJI SDK Manager
        _handler = new Handler(Looper.getMainLooper());

        openConnectionFragment();
    }




    public void openConnectionFragment()
    {
        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {


            // Create a new Fragment to be placed in the activity layout
            Fragment connectionFragment = new ConnectionFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            connectionFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, connectionFragment, "CONNECTION_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            getSupportFragmentManager().executePendingTransactions();

        }
    }


    public void openBroadcastFragment (View view)
    {

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {


            // Create a new Fragment to be placed in the activity layout
            BroadcastSearchFragment broadcastFragment = new BroadcastSearchFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            broadcastFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, broadcastFragment, "BROADCAST_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            getSupportFragmentManager().executePendingTransactions();

        }

        BroadcastSearchFragment fragment = (BroadcastSearchFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        fragment.startBroadcastSearch();

    }

    /**
 * Method for the button which will register the DJISDKManager and translate to the
 * remote activity if the connection to the simulator is successful
 *
 */
public void connect (String host)
{
    if (NetworkManagerUDP.hasWifiConnection(getApplicationContext())) {

        DJISDKManager.getInstance().initSDKManager(this, _djiSDKManagerCallback, host, SIMULATOR_UDP_PORT);   // Overloaded method, originally without host and port
    }else
    {
        // If no wifi-connection is available, show toast with error message
        Toast.makeText(getApplicationContext(), "Not connected with the local network, please check your WiFi-Connection-", Toast.LENGTH_LONG).show();
    }
}

    /**
     * Method for the button which will register the DJISDKManager and translate to the
     * remote activity if the connection to the simulator is successful
     *
     */
    public void connect (View view)
    {
        if (NetworkManagerUDP.hasWifiConnection(getApplicationContext())) {
            String host = "0";
            int port;

            // Userinput is fetched from the inputfields
            EditText hostField = (EditText) findViewById(R.id.hostField);
            EditText portField = (EditText) findViewById(R.id.portField);

            host = hostField.getText().toString();
            port = Integer.parseInt(portField.getText().toString());

            DJISDKManager.getInstance().initSDKManager(this, _djiSDKManagerCallback, host, port);   // Overloaded method, originally without host and port
        }else
        {
            // If no wifi-connection is available, show toast with error message
            Toast.makeText(getApplicationContext(), "Not connected with the local network, please check your WiFi-Connection-", Toast.LENGTH_LONG).show();
        }
    }


    /**
     * Implements the Callbackmanager
     */
    private DJISDKManager.DJISDKManagerCallback _djiSDKManagerCallback = new DJISDKManager.DJISDKManagerCallback()
    {
        @Override
        public void onGetRegisteredResult(DJIError error)
        {
            Log.d(TAG, error == null ? "success" : error.getDescription());
            if(error == DJISDKError.REGISTRATION_SUCCESS)
            {
                // Starts connecting to the product, in this implementation it
                // just creates a new DJIBaseProduct and calls the onProductChange() method
                DJISDKManager.getInstance().startConnectionToProduct();
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Toast.makeText(getApplicationContext(), "Register App Successful", Toast.LENGTH_LONG).show();
                    }
                });

                callRemoteIntent(DJISDKManager.getInstance().getHost(), DJISDKManager.getInstance().getPort());
            }else
            {
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Toast.makeText(getApplicationContext(), "Register App Failed! Please enter your App Key and check the network.", Toast.LENGTH_LONG).show();
                    }
                });
            }
            Log.e("TAG", error.toString());
        }

        @Override
        public void onProductChanged(DJIBaseProduct oldProduct, DJIBaseProduct newProduct)
        {
            _product = newProduct;
            if(_product != null) {
                _product.setDJIBaseProductListener(_djiBaseProductListener);
            }
            notifyStatusChange();
        }
    };

    /**
     * Starts the remote activity
     */
    private void callRemoteIntent(String host, int port)
    {
        // New intent for starting the remote activity
        Intent i = new Intent(getApplicationContext(), RemoteActivity.class);

        // Puts the host and port as parameter to the new intent
        i.putExtra("host", host);
        i.putExtra("port", port);

        // Lets the device vibrate as notification for the user that it is connected
        vibrate(200);

        // Starts the remote activity
        startActivity(i);
    }

    /**
     * Lets the device vibrate as notification
     * @param duration duration of the vibration in milliseconds
     */
    private void vibrate(int duration)
    {
        // Get instance of Vibrator from current Context
        Vibrator mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        // Vibrate for the transmitted duration in milliseconds
        mVibrator.vibrate(duration);
    }

    /**
     * Implements the DJIBaseProductListener to be added to the DJIBaseProduct
     */
    private DJIBaseProduct.DJIBaseProductListener _djiBaseProductListener = new DJIBaseProduct.DJIBaseProductListener()
    {
        @Override
        public void onComponentChange(DJIBaseProduct.DJIComponentKey key, DJIBaseComponent oldComponent, DJIBaseComponent newComponent)
        {
            if(newComponent != null)
            {
                newComponent.setDJIComponentListener(_djiComponentListener);
            }
            notifyStatusChange();
        }

        @Override
        public void onProductConnectivityChanged(boolean isConnected)
        {
            notifyStatusChange();
        }
    };

    /**
     * Implements DJIComponentListener
     */
    private DJIBaseComponent.DJIComponentListener _djiComponentListener = new DJIBaseComponent.DJIComponentListener() {
        @Override
        public void onComponentConnectivityChanged(boolean isConnected) {
            notifyStatusChange();
        }
    };

    private void notifyStatusChange()
    {
        _handler.removeCallbacks(updateRunnable);
        _handler.postDelayed(updateRunnable, 500);
    }

    private Runnable updateRunnable = new Runnable()
    {
        @Override
        public void run()
        {
            Intent intent = new Intent(FLAG_CONNECTION_CHANGE);
            sendBroadcast(intent);  // Schauen mit dem Intents, ob man da irgendwie was regeln muss, da diese Activity anders als im Beispiel nicht die Main bzw. Launcheractivity ist
        }
    };
}

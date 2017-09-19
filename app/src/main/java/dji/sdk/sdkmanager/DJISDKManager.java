package dji.sdk.sdkmanager;

import android.content.Context;

import com.drnsmltr.quadrocopterremote.networking.NetworkManagerTCP;

import dji.common.error.DJIError;
import dji.common.error.DJISDKError;
import dji.common.util.DJICommonCallbacks;
import dji.other.DJISDKCache;
import dji.other.Subscription;
import dji.sdk.base.DJIBaseProduct;
import dji.sdk.flightcontroller.DJIFlyZoneManager;

/**
 *
 *
 * This class contains methods for you to the register app, start or stop connection with the product.
 * After registration, the connected product can be accessed through DJISDKManager.
 * The components of the product can then be controlled.
 */

public class DJISDKManager
{
    public static final String USB_ACCESSORY_ATTACHED = "USB_ACCESSORY_ATTACHED";

    public DJISDKManager.DJISDKManagerCallback sdkManagerCallback;

    private final String _version = "0.0.1";

    private Context _context;

    private DJIBaseProduct _product;

    private DJISDKManagerCallback _callback;

    private static DJISDKManager _instance = null;

    /**
     * Simulator purposes
     */
    private String _host;
    private int _port;

    /**
     * Callback interface for SDK manager.
     */
    public interface DJISDKManagerCallback
    {
        /**
         * Callback method after the application attempts to register.
         * @param error This parameter will be DJISDKError.REGISTRATION_SUCCESS if registration is
         *              successful. Otherwise it contains other DJIError object.
         */
        public abstract void onGetRegisteredResult (DJIError error);

        /**
         * Called when the product variable is changed.
         * oldProduct will be null if starting up.
         * newProduct will be null if the USB link or WiFi link between the product and phone is disconnected.
         * @param oldProduct
         * @param newProduct
         */
        public abstract void onProductChanged (DJIBaseProduct oldProduct, DJIBaseProduct newProduct);
    }


    public void addSubscription (Subscription subscription)
    {

    }

    /**
     * The DJI Mobile SDK collects logs that are related to flight. These logs can be used to help
     * diagnose the cause of a product's flight failure at the SDK and mobile application layer. T
     * hey are predominantly used by a DJI service facility, who will combine them with the product's
     * flight logs (stored on the product) to better understand the root cause of a crash and determine
     * whether the incident is covered under warranty. They can also be used by developers to debug their
     * application. SDK Logs record commands from the application to the SDK, and information from the SDK
     * to the application that are related to flight. Logs are cached to the mobile device, and will overwrite
     * themselves to limit storage footprint. `archiveLogs` will move the logs to an archive folder. Logs in
     * the archive, will only be overwritten by newer archives that go beyond the storage limit and not normal
     * log generation. The storage limit for normal log generation is 400 MB (about 500 minutes of flight).
     * The storage limit for the archive is an additional 400 MB. The logs have an encrypted and unencrypted
     * portion. The unencrypted portion can be used by developers to see all commands and information sent to
     * and received from the SDK by the mobile application that are related to flight. The encrypted portion
     * can only be used by a DJI service facility as it includes property hardware protocols and are used to
     * tie the SDK logs and product flight logs together. Logs can be transferred to the DJI service facility
     * either by manually downloading from the mobile device using iTunes, or the application can send archived
     * logs to a DJI endpoint using `uploadArchive`. Developers should be careful to upload logs directly when
     * the user is on a cellular connection as the archive can be up to 400 MB. returns: path of archived logs,
     * nil if a problem occured.
     * @param callback
     * @return
     */
    public String archiveLogs (DJICommonCallbacks.DJICompletionCallback callback)
    {
        return "";
    }

    /**
     * This method is for developer to close the aoa connection directly.
     * It should not be invoke in normal logic. When developer use AS or Eclipse to build and run app,
     * they will kill the old app first, the kill is not disconnect the aoa link. It will cause the new
     * app can't connect aoa, need to plug in the usb line again. The developer should config AS and Eclipse,
     * make it invoke this method before complie app, so that can close the aoa link first.
     */
    public void closeAoaConnection ()
    {

    }

    /**
     * Releases the resources held by the DJISDKManager. Deallocate memory in the reversed order of #initParams()
     */
    public void destroy ()
    {

    }

    /**
     * Enter debug mode with debug IP.
     * @param debugIP   Debug ID from the DJI Bridge App. Attention！The method should be invoked before initSDKManager()
     */
    public void enterDebugModeWithDebugIP (String debugIP)
    {

    }

    public DJISDKCache getCache ()
    {
        return null;
    }

    /**
     * Returns the Context in which the SDK has been initialized
     * @return
     */
    public Context getContext ()
    {
        return _context;
    }

    public DJIBluetoothProductConnector getDJIBluetoothProductConnector ()
    {
        return null;
    }

    /**
     * Returns the available DJIBaseProduct object. Returns null if no product is available.
     * @return
     */
    public DJIBaseProduct getDJIProduct ()
    {
        return _product;
    }

    public DJIFlyZoneManager getFlyZoneManager ()
    {
        return null;
    }

    public static synchronized DJISDKManager getInstance ()
    {
            if(_instance == null)
            {
                _instance = new DJISDKManager();
            }
            return _instance;
    }

    /**
     * Gets the DJI Mobile SDK version.
     * @return  SDK version as a string.
     */
    public String getSDKVersion ()
    {
        return _version;
    }

    /**
     * true if SDK has already registered.
     * @return  true if SDK has already registered.
     */
    public boolean hasSDKRegistered ()
    {
        // Always true because the SDK never has to be registered for the simulator application
        return true;
    }

    /**
     * Initiates the SDK. Original method
     * @param context
     * @param callback
     */
    public void initSDKManager (Context context, DJISDKManager.DJISDKManagerCallback callback)
    {

    }

    /**
     * Initiates the SDK. Overloaded method for Simulator proposes.
     * @param context
     * @param callback
     * @param host
     * @param port
     */
    public void initSDKManager (final Context context, final DJISDKManager.DJISDKManagerCallback callback, final String host, final int port)
    {
        _context = context;
        _callback = callback;

        // Instead of registering the application, we check if the connection for the given host and port is available
        final NetworkManagerTCP nwManager = new NetworkManagerTCP(host, port);

        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                if(nwManager.testConnection(3000)) // if the TCP Socket responds within the given time
                {
                    _host = host;
                    _port = port;
                    DJISDKError.REGISTRATION_SUCCESS.setDescription("Connection to the Simulator successful.");
                    callback.onGetRegisteredResult(DJISDKError.REGISTRATION_SUCCESS);

                    //connectionSuccess(context, callback, host, port);
                }else
                {
                    DJISDKError.REGISTRATION_UNKNOWN_ERROR.setDescription("Could not connect to the TCP-Socket of the Simulator under given host and ip.");
                    callback.onGetRegisteredResult(DJISDKError.REGISTRATION_UNKNOWN_ERROR);
                }
            }
        });

        thread.start();
    }

    private void connectionSuccess(Context context, DJISDKManager.DJISDKManagerCallback callback, final String host, final int port)
    {

    }

    /**
     * The first time the app is initialized after installation, the app connects to a DJI Server
     * through the internet to verify the Application Key. Subsequent app starts will use locally
     * cached verification information to register the app.
     */
    public void registerApp ()
    {

    }

    /**
     * Determines whether the callback should be invoked in UIThread or BackgroundThread.
     * This method is just for setXXX and getXXX, the push callback is forced to run in the BackgroundThread.
     * @param enable
     */
    public void setCallbackRunInUIThread (boolean enable)
    {

    }

    /**
     * Some products (Mavic Pro, Inspire 2, Phantom 4 Pro) can use 5 GHz wireless spectrum that is
     * not permissable in some countries. By default, the 5 GHz usage is not enabled, but on registration
     * the SDK will do a country code check to determine whether 5 GHz can be used. The check can involve
     * sending location data to a server. This method can be used to disable this check, leaving the default
     * configuration of only using the 2.4 GHz spectrum. Note: this method must be called before
     * calling `+registerApp:withDelegate:` in order to take effect.
     */
    public void setDisableCountryCodeCheck ()
    {

    }

    /**
     * Change the flag if we are only connect bluetooth device. Otherwise, the default value for isSupportOnlyForBluetoothDevice is false.
     * @param isBluetoothDevice true if the service is only for bluetooth device.
     */
    public void setSupportOnlyForBluetoothDevice (boolean isBluetoothDevice)
    {

    }

    /**
     * Starts a connection to the DJI product.
     * This method should be called after successful registration of the app. `onProductChanged()`
     * will be called if the connection succeeded.
     * @return  true if the connection is started successfully.
     */
    public boolean startConnectionToProduct ()
    {
        // Normally the real DJI product would be fetched here by USB or WiFi. So we just simulate the product.
        // TODO: Fetch the data from the actual Simulator by requesting the parameters of the drone via TCP-Socket
        DJIBaseProduct newProduct = new DJIBaseProduct();

        _callback.onProductChanged(_product, newProduct);

        return true;
    }

    /**
     * Disconnects the existing connection to the DJI product.
     */
    public void stopConnectionToProduct ()
    {

    }

    /**
     * Upload the archive to DJI. The archive will not be deleted when calling this method.
     * @param callback
     */
    public void uploadArchivedLogs (DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Returns the host with which the SDK has been initialized
     */
    public String getHost()
    {
        return _host;
    }

    /**
     * Returns the port with which the SDK has been initialized
     */
    public int getPort()
    {
        return _port;
    }

}

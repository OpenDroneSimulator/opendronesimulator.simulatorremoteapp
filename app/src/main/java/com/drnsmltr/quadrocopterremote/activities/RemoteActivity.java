package com.drnsmltr.quadrocopterremote.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.drnsmltr.quadrocopterremote.model.Direction;
import com.drnsmltr.quadrocopterremote.model.LEDStatus;
import com.drnsmltr.quadrocopterremote.networking.PingManager;
import com.drnsmltr.quadrocopterremote.virtualcontroller.FlightController;
import com.reiss.yanneck.quadcopterremote.R;
import com.drnsmltr.quadrocopterremote.virtualcontroller.Joystick;

import dji.common.error.DJIError;
import dji.common.error.DJISDKError;
import dji.common.flightcontroller.DJIFlightControllerControlMode;
import dji.common.flightcontroller.DJIFlightControllerRemoteControllerFlightMode;
import dji.common.flightcontroller.DJIFlightFailsafeOperation;
import dji.common.flightcontroller.DJIFlightOrientationMode;
import dji.common.flightcontroller.DJIIMUState;
import dji.common.flightcontroller.DJILocationCoordinate2D;
import dji.common.flightcontroller.DJIVirtualStickFlightControlData;
import dji.common.util.DJICommonCallbacks;
import dji.sdk.flightcontroller.DJIFlightController;
import dji.sdk.flightcontroller.DJIFlightControllerDelegate;


/**
 * Used as remote, contains the virtual joysticks and sends the control commands to the simulator
 */
public class RemoteActivity extends Activity {

    private static final String TAG = RemoteActivity.class.getSimpleName();

    Joystick _joystick;
    PingManager _pingManager;

    private final int MOVEDATA_PING_IN_NANO = 10000000; // PING IN NANOSECONDS
    boolean _running = true;

    DJIFlightController _djiFlightController;
    FlightController _myFlightController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Turn off titlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Fullscreen mode
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_remote);

        // Um IP + Host in TextView anzuzeigen
        Bundle extras = getIntent().getExtras();

        String host = (String) extras.get("host");

        int port = (int) extras.get("port");

        TextView textView = (TextView) findViewById(R.id.remote_title_textView);
        textView.setText("\n" + host + ":" + port);

        // Initializes the virtual joystick with the related UI elements
        initJoystick();

        // Initializes the DJIFlightController
        initDJIFlightController();

        // Sets the listener for the text change on the pingField
        //setPingFieldListeners();

        // Sets the joystick listeners for joystick changes
        setJoystickListeners();

        // Initializes the PingManager with the current pingField value
        //initPingManager();

        runUpdate();
    }

    // Starts the Update Thread
    private void runUpdate()
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                long timeSinceLastUpdate = System.nanoTime();

                while (_running) {
                    if ((System.nanoTime() - timeSinceLastUpdate) > MOVEDATA_PING_IN_NANO) {
                        sendMoveData();
                        timeSinceLastUpdate = System.nanoTime();
                    }
                }
            }
        }).start();

    }



    /**
     * Initializes the Ping manager
     */
    private void initPingManager()
    {
        /*
        EditText pingText = (EditText) findViewById(pingField);

        int ping = Integer.parseInt(pingText.getText().toString());

        _pingManager = new PingManager(ping);

        */
    }

    /**
     * Initializes the FlightController and implements the needed methods
     */
    private void initDJIFlightController()
    {
        // Used to fill the wrapper DJI methods
        _myFlightController = new FlightController();

        _djiFlightController = new DJIFlightController()
        {
            @Override
            public void autoLanding(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void cancelAutoLanding(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void cancelGoHome(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void cancelTakeOff(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void confirmLanding(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void disableVirtualStickControlMode(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void enableVirtualStickControlMode(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void getControlMode(DJICommonCallbacks.DJICompletionCallbackWith<DJIFlightControllerControlMode> callback)
            {

            }

            @Override
            public void getFlightFailsafeOperation(DJICommonCallbacks.DJICompletionCallbackWith<DJIFlightFailsafeOperation> callback)
            {

            }

            @Override
            public void getGoHomeAltitude(DJICommonCallbacks.DJICompletionCallbackWith<Float> callback)
            {

            }

            @Override
            public void getGoHomeBatteryThreshold(DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback)
            {

            }

            @Override
            public void getHomeLocation(DJICommonCallbacks.DJICompletionCallbackWith<DJILocationCoordinate2D> callback)
            {

            }

            @Override
            public void getLEDsEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
            {
                _myFlightController.getLEDsEnabled(callback);
            }

            @Override
            public void getLandImmediatelyBatteryThreshold(DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback)
            {

            }

            @Override
            public void getMultiSideIMUCalibrationStatus(DJICommonCallbacks.DJICompletionCallbackWith<DJIIMUState> callback)
            {

            }

            @Override
            public int getNumberOfIMUs()
            {
                return 0;
            }

            @Override
            public void getQuickSpinEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
            {

            }

            @Override
            public void getRemoteControllerFlightModeMappingWithCompletion(DJICommonCallbacks.DJICompletionCallbackWith<DJIFlightControllerRemoteControllerFlightMode[]> callback)
            {

            }

            @Override
            public void getTerrainFollowModeEnable(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
            {

            }

            @Override
            public void getTripodModeEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
            {

            }

            @Override
            public void goHome(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public boolean isIntelligentFlightAssistantSupported()
            {
                return false;
            }

            @Override
            public void isLandingConfirmationNeeded(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
            {

            }

            @Override
            public boolean isLandingGearMovable()
            {
                return false;
            }

            @Override
            public boolean isOnboardSDKDeviceAvailable()
            {
                return false;
            }

            @Override
            public boolean isRtkSupported()
            {
                return false;
            }

            @Override
            public boolean isVirtualStickControlModeAvailable()
            {
                return false;
            }

            @Override
            public void lockCourseUsingCurrentDirection(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void sendDataToOnboardSDKDevice(byte[] data, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void sendVirtualStickFlightControlData(DJIVirtualStickFlightControlData controlData, DJICommonCallbacks.DJICompletionCallback callback)
            {
                _myFlightController.sendVirtualStickFlightControlData(controlData, callback);
            }

            @Override
            public void setAutoQuickSpinEnabled(Boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setControlMode(DJIFlightControllerControlMode controlMode, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setFlightFailsafeOperation(DJIFlightFailsafeOperation operation, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setFlightOrientationMode(DJIFlightOrientationMode type, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setGoHomeAltitude(float altitude, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setGoHomeBatteryThreshold(int param, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setHomeLocation(DJILocationCoordinate2D homePoint, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setHomeLocationUsingAircraftCurrentLocation(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setLEDsEnabled(boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setLandImmediatelyBatteryThreshold(int param, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setOnIMUStateChangedCallback(DJIFlightControllerDelegate.FlightControllerIMUStateChangedCallback callback)
            {

            }

            @Override
            public void setTerrainFollowModeEnabled(Boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void setTripodModeEnabled(Boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void startIMUCalibration(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void startIMUCalibration(int index, DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void takeOff(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void turnOffMotors(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }

            @Override
            public void turnOnMotors(DJICommonCallbacks.DJICompletionCallback callback)
            {

            }
        };
    }

    /**
     * Checks for the LED Status and updates the led text if the button for it gets pressed
     */
    public void checkLEDStatus(View view)
    {
        _djiFlightController.getLEDsEnabled(_ledEnabledCallback);
    }

    /**
     * Initializes the completition callback for sending move data
     */
    DJICommonCallbacks.DJICompletionCallback _completitionCallback = new DJICommonCallbacks.DJICompletionCallback()
    {
        @Override
        public void onResult(DJIError error)
        {

            if(error != null)
                if(error == DJISDKError.SEND_DATA_ERROR) {
                    Log.d(TAG, "An error occured while sending the DJIFlightControlData to the Simulator.");
                }


        }
    };


    /**
     * Used for the example on receiving sensor information
     */
    DJICommonCallbacks.DJICompletionCallbackWith<Boolean> _ledEnabledCallback = new DJICommonCallbacks.DJICompletionCallbackWith<Boolean>()
    {
        public void setLEDText(LEDStatus LEDText)
        {
            //TextView ledTextView = (TextView) findViewById(R.id.ledStatusTextView);

            if(LEDText == LEDStatus.ACTIVATED)
            {
                Log.d(TAG, "LED Status: " + LEDText);
                //ledTextView.setText("LED aktiviert");
            }else if(LEDText == LEDStatus.DEACTIVATED)
            {
                Log.d(TAG, "LED Status: " + LEDText);
                //ledTextView.setText("LED deaktiviert");
            }else if(LEDText == LEDStatus.UNKNOWN)
            {
                Log.d(TAG, "LED Status: " + LEDText);
                //ledTextView.setText("Status unbekannt");
            }
        }

        @Override
        public void onFailure(DJIError error)
        {
            Log.d(TAG, "Ein Fehler ist beim Abfragen der LEDs aufgetreten" + error);
        }

        @Override
        public void onSuccess(Boolean aBoolean)
        {
            if(aBoolean.equals(null))
            {

            }else if(aBoolean == true)
            {
                setLEDText(LEDStatus.ACTIVATED);
            }else if(aBoolean == false)
            {
                setLEDText(LEDStatus.DEACTIVATED);
            }
        }
    };

    /**
     * Initializes the Joystick
     */
    private void initJoystick()
    {
        // The bottom knob  of the left stick
        ImageView mainKnobLeft = (ImageView) findViewById(R.id.imageView_mainKnobLeft);

        // The Top Knob which will be moved of the left stick
        ImageView topKnobLeft = (ImageView) findViewById(R.id.imageView_topKnobLeft);

        // The bottom knob  of the right stick
        ImageView mainKnobRight = (ImageView) findViewById(R.id.imageView_mainKnobRight);

        // The Top Knob which will be moved of the right stick
        ImageView topKnobRight = (ImageView) findViewById(R.id.imageView_topKnobRight);

        // Actual initialization, first two variables are for the left stick, the next two variables are for the right stick
        _joystick = new Joystick(mainKnobLeft, topKnobLeft, mainKnobRight, topKnobRight);
    }


    /**
     * Sets the listener for the pingfield
     */
    /*
    private void setPingFieldListeners()
    {
       EditText pingField = (EditText) findViewById(R.id.pingField);

        pingField.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if(s.length() > 0) {
                    int ping = Integer.parseInt(s.toString());

                    _pingManager.setPing(ping);
                }
            }

            @Override
            public void afterTextChanged(Editable s)
            {

            }
        });
    }
    */

    /**
     * Sets the listeners for the joysticks, so that the right logic is invoked if one of them or even both get touched
     */
    private void setJoystickListeners()
    {
        // Input Listener for the left knob
        ImageView tvLeft = (ImageView) findViewById(R.id.imageView_mainKnobLeft);
        tvLeft.setOnTouchListener(new android.view.View.OnTouchListener() {


            /**
             * Called when a touch event is dispatched to a view. This allows listeners to
             * get a chance to respond before the target view.
             *
             * @param v     The view the touch event has been dispatched to.
             * @param event The MotionEvent object containing full information about
             *              the event.
             * @return True if the listener has consumed the event, false otherwise.
             */
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {

                // The Direction of the Joystick for which the listener is set for
                Direction direction = Direction.LEFT;

                float touchInputX = event.getRawX();
                float touchInputY = event.getRawY();


                // If this is the first time the button gets touched
                if(_joystick.isLeftStickFirstTouched())
                {
                    _joystick.firstTouch(direction);
                }

                switch (event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        UpdatePositionDebugView(touchInputX, touchInputY);

                        break;
                    }
                    case MotionEvent.ACTION_MOVE:
                    {
                        // Updates the debug view
                        UpdatePositionDebugView(touchInputX, touchInputY);

                        // Calculates the input for the left stick
                        _joystick.calculateInput(direction, touchInputX, touchInputY); // Invokes the calculation

                        // Degree of the left topknob from the center of the bottomknob
                        float angleDegrees = _joystick.getLeftStickAngle();

                        // Power -> How far is the position of the topknob from the center of the left mainknob to the outline of the mainknob
                        float power = _joystick.getLeftStickPower();

                        // Updates the debug view
                        UpdateFloatAngleDebugView(angleDegrees, power);

                        //MessageParser parser = new MessageParser();
                        //String message = parser.parseAsJSON(direction, angleDegrees, power);

                        // Sends new flightData to the simulator
                        //sendMoveData(false);

                        break;
                    }
                    case MotionEvent.ACTION_UP: // if the user lifts the finger up
                    {
                        // Sets the current power to 0 in the debug view
                        TextView tvPower = (TextView) findViewById(R.id.remote_power);
                        tvPower.setText(0.0 + " %");

                        // Reset the Position of the topKnob to the origin of the mainKnob
                        _joystick.resetJoystickPosition(direction);

                        // Send flightdata with reset knob
                        //sendMoveData(true);

                        break;
                    }
                    default:
                    {
                        return false;
                    }

                }

                return true;
            }
        });

        // Input Listener for the right knob
        ImageView tvRight = (ImageView) findViewById(R.id.imageView_mainKnobRight);
        tvRight.setOnTouchListener(new android.view.View.OnTouchListener() {


            /**
             * Called when a touch event is dispatched to a view. This allows listeners to
             * get a chance to respond before the target view.
             *
             * @param v     The view the touch event has been dispatched to.
             * @param event The MotionEvent object containing full information about
             *              the event.
             * @return True if the listener has consumed the event, false otherwise.
             */
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {

                // The Direction of the Joystick for which the listener is set for
                Direction direction = Direction.RIGHT;

                float touchInputX = event.getRawX();
                float touchInputY = event.getRawY();

                // If this is the first time the button gets touched
                if(_joystick.isRightStickFirstTouched())
                {
                    _joystick.firstTouch(direction);
                }

                switch (event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                    {
                        UpdatePositionDebugView(touchInputX, touchInputY);

                        break;
                    }
                    case MotionEvent.ACTION_MOVE:
                    {
                        // Updates the debug view
                        UpdatePositionDebugView(touchInputX, touchInputY);

                        // Calculates the input
                        _joystick.calculateInput(direction, touchInputX, touchInputY); // Invokes the calculation

                        // Degree of the right topknob from the center of the bottomknob
                        float angleDegrees = _joystick.getRightStickAngle();

                        // Power -> How far is the position of the right topknob from the center of the right mainknob to the outline of the right mainknob
                        float power = _joystick.getRightStickPower();

                        // Updates the debug view
                        UpdateFloatAngleDebugView(angleDegrees, power);

                        //MessageParser parser = new MessageParser();
                        //String message = parser.parseAsJSON(direction, angleDegrees, power);    // Builds up a json string with direction, angle and power

                        // Sends new flightData to the simulator
                        //sendMoveData(false);

                        break;
                    }
                    case MotionEvent.ACTION_UP: // if the user lifts the finger up
                    {
                        // Sets the current power to 0 in the debug view
                        TextView tvPower = (TextView) findViewById(R.id.remote_power);
                        tvPower.setText(0.0 + " %");

                        // Reset the Position of the topKnob to the origin of the mainKnob
                        _joystick.resetJoystickPosition(direction);

                        // Send flightdata with reset knob
                        //sendMoveData(true);

                        break;
                    }
                    default:
                    {
                        return false;
                    }

                }

                return true;
            }
        });
    }



    /**
     * Sends the data to the DJIFlightController and therefore to the Simulator
     */
    private void sendMoveData()
    {
            try {
                _djiFlightController.sendVirtualStickFlightControlData(_joystick.getVirtualStickFlightControlData(), _completitionCallback);
            } catch (Exception e) {
                Log.d(TAG, "Could not send the Virtual Stick data because of the following exception: " + e.toString());

                Context context = getApplicationContext();
                CharSequence text = "Connection to Server interrupted.";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                finish();

            }
    }

    /**
     * Refreshes the debug view for the angle and power with the new values
     * @param angleDegrees
     * @param power
     */
    private void UpdateFloatAngleDebugView(float angleDegrees, float power)
    {
        TextView tvAngleDegrees = (TextView) findViewById(R.id.remote_angle);
        tvAngleDegrees.setText("Grad: " + angleDegrees);

        TextView tvPower = (TextView) findViewById(R.id.remote_power);
        tvPower.setText(power + " %");
    }

    /**
     * Refreshes the debug view for the touch input x & y value with the new values
     * @param touchInputX
     * @param touchInputY
     */
    private void UpdatePositionDebugView(float touchInputX, float touchInputY)
    {
        TextView xposView = (TextView) findViewById(R.id.remote_xpos);
        xposView.setText("X: " + touchInputX);

        TextView yposView = (TextView) findViewById(R.id.remote_ypos);
        yposView.setText("Y: " + touchInputY);
    }


    /**
     * Destroys this activity on return
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            _running = false;
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

}

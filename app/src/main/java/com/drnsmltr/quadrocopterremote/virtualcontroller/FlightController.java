package com.drnsmltr.quadrocopterremote.virtualcontroller;

import android.util.Log;

import com.drnsmltr.quadrocopterremote.networking.NetworkManagerUDP;
import com.drnsmltr.quadrocopterremote.parsing.MessageParser;

import java.io.IOException;

import dji.common.error.DJIError;
import dji.common.error.DJISDKError;
import dji.common.flightcontroller.DJIVirtualStickFlightControlData;
import dji.common.util.DJICommonCallbacks;
import dji.sdk.sdkmanager.DJISDKManager;

/**
 *
 *
 * FlightController which executes the logic of the DJIFlightController
 */
public class FlightController
{
    private static final String TAG = FlightController.class.getSimpleName();

    NetworkManagerUDP _networkManager;

    /**
     * Constructor
     */
    public FlightController()
    {
        _networkManager = new NetworkManagerUDP(DJISDKManager.getInstance().getHost(), DJISDKManager.getInstance().getPort());
    }

    /**
     * Simulates the original method from the DJIFlightController class
     * @param controlData
     * @param callback
     */
    public void sendVirtualStickFlightControlData(DJIVirtualStickFlightControlData controlData, DJICommonCallbacks.DJICompletionCallback callback)
    {
        MessageParser msgParser = new MessageParser();

        String msg = msgParser.parseAsJSON(controlData.getPitch(), controlData.getRoll(), controlData.getYaw(), controlData.getVerticalThrottle());

        try{
            // Tries to send the control data to the simulator
            _networkManager.sendMessage(msg);

            // No error
            callback.onResult(null);
        }catch(Exception e)
        {
            Log.d(TAG, "DJIVirtualStickFlightControlData couldn not be sent to the Simulator.");

            // Send Data Error
            callback.onResult(DJISDKError.SEND_DATA_ERROR);
        }

    }

    /**
     * Requests the Simulator if the LEDs are enabled or not
     * @param callback
     */
    public void getLEDsEnabled(final DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {
        final String sensorDataRequestCode = "GETLEDSENABLED";
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    String sensorData = _networkManager.getSensorData(sensorDataRequestCode);

                    if (sensorData.equals("Error")) {
                        callback.onFailure(DJIError.COMMON_PARAM_INVALID);
                    }
                    else if (sensorData.equals("True")) {
                        callback.onSuccess(true);
                    }
                    else if (sensorData.equals("False")) {
                        callback.onSuccess(false);
                    }else
                    {
                        callback.onFailure(DJIError.COMMON_UNKNOWN);
                    }
                }catch (IOException ioe)
                {
                    Log.d(TAG, ioe.getMessage());
                    callback.onFailure(DJIError.COMMON_DISCONNECTED);
                }

            }
        });
        thread.start();

    }
}

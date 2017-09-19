package dji.sdk.handheldcontroller;

import dji.common.handheld.DJIHandheldControllerHardwareState;
import dji.common.handheld.DJIHandheldControllerLEDCommand;
import dji.common.handheld.DJIHandheldPowerMode;
import dji.common.util.DJICommonCallbacks;

/**
 *
 *
 * This class contains interfaces to control a handheld device. You can make a handheld device enter sleep mode, awake from sleep mode, or shut down.
 */

public abstract class DJIHandheldController
{

    /**
     * Callback to receive the updated power mode of the handheld controller.
     */
    public interface DJIHandheldPowerModeListener
    {
        /**
         * Invoked with execution result when the asynchronous call completes. Override to handle in your own code.
         * @param status    Handheld controller's current power mode.
         */
        public abstract void onResult(DJIHandheldPowerMode status);
    }

    /**
     * Callback for the handheld controller's current hardware state (e.g. the state of the physical buttons and joysticks). Supported only by Osmo Mobile.
     */
    public interface DJIUpdateHardwareStateCallback
    {
        public abstract void onResult(DJIHandheldControllerHardwareState state);
    }

    public DJIHandheldController ()
    {

    }

    /**
     * Release the resource.
     */
    public void Destroy ()
    {

    }

    /**
     * Controls the LED of the handheld controller.
     * @param command       The command to control the LED.
     * @param callback      The execution callback with the execution result returned.
     */
    public abstract void controlLEDWithCommand (DJIHandheldControllerLEDCommand command, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Returns firmware version of the component.
     * @param callback
     */
    public void getFirmwareVersion (DJICommonCallbacks.DJICompletionCallbackWith<String> callback)
    {

    }

    /**
     * Gets if the gimbal control with the joystick is enabled or not. It is only supported in firmware version 1.2.0.40 or above.
     * @param callback  The execution callback with the returned value(s).
     */
    public abstract void getStickGimbalControlEnabled (DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback);

    /**
     *  Set up the listener for the power mode status.
     * @param listener  The listener for the power mode status.
     */
    public void setDJIHandheldPowerModeListener (DJIHandheldController.DJIHandheldPowerModeListener listener)
    {

    }

    /**
     * Set the power mode for handheld.
     * @param mode          The power mode to set. CAUTION: when the mode is DJIHandheldPowerModePowerOff,
     *                      the handheld device will be shut down and the connection will be broken. The user must then power on the device manually.
     * @param callback      The execution callback with the execution result returned.
     */
    public abstract void setHandheldPowerMode (DJIHandheldPowerMode mode, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Enables/disables joystick control of the gimbal. By default, it is enabled.
     * The handheld will be reset to the default value when it reboots or SDK reinitializes.
     * When gimbal control is disabled, the joystick can be used for other purposes in an SDK
     * application by reading its position values with `joystickVerticalDirection` and
     * `joystickHorizontalDirection`. It is only supported in firmware version 1.2.0.40 or above.
     * @param enabled       True to enable the gimbal control.
     * @param callback      The execution callback with the execution result returned.
     */
    public abstract void setStickGimbalControlEnabled (Boolean enabled, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Set up the callback for the handheld's hardware state.
     * @param callback      Callback for the handheld controller's current hardware state (e.g. the state of the physical buttons and joysticks).
     */
    public void setUpdateHardwareStateCallback (DJIHandheldController.DJIUpdateHardwareStateCallback callback)
    {

    }
}

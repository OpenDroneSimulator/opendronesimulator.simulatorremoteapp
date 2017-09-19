package dji.sdk.flightcontroller;

import dji.common.flightcontroller.DJILandingGearMode;
import dji.common.flightcontroller.DJILandingGearStatus;
import dji.common.util.DJICommonCallbacks;

/**
 *
 * This class contains the state of the landing gear. It also provides methods to control the landing gear.
 */

public class DJILandingGear
{
    public DJILandingGear()
    {

    }

    /**
     * Deploys the landing gear. Should only be used when `setLandingGearMode` is
     * `DJILandingGearModeNormal`. Only supported by Inspire 1 and Inspire 2. For Matrice 600 and
     * Matrice 600 Pro, the landing gear cannot be controlled through the SDK, only automatically
     * by the aircraft or manually by the remote controller.
     * @param callback The execution callback with the execution result returned.
     */
    public void deployLandingGear(DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Enters the transport mode. In transport mode, the landing gear will be in the same geometric
     * plane as the aircraft body so it can be easily transported. It is only supported by
     * Inspire 1 and Inspire 2.
     * @param callback  The execution callback with the execution result returned.
     */
    public void enterTransportMode(DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Exit transport mode. It is only supported by Inspire 1 and Inspire 2.
     * @param callback  The execution callback with the execution result returned.
     */
    public void exitTransportMode(DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * The current mode of the landing gear.
     * @return
     */
    public DJILandingGearMode getLandingGearMode()
    {
        return null;
    }

    /**
     * The current state/position of the landing gear.
     * @return
     */
    public DJILandingGearStatus getLandingGearStatus()
    {
        return null;
    }

    /**
     * Indicates whether the self-adaptive landing gear is turned on or off. If the self-adaptive
     * landing gear is turned on, when the Inspire 1 is 0.5m above the ground, the landing gear
     * will automatically lower. After it takes off, once the Inspire 1 is 0.5m above the ground,
     * the landing gear will automatically be raised up. If self-adaptive landing gear is turned
     * off, the Inspire 1 will not automatically lower and raise the landing gear.
     * @return
     */
    public boolean isSelfAdaptiveLandingGearOn()
    {
        return false;
    }

    /**
     * Retracts the landing gear. Should only be used when `setLandingGearMode` is
     * `DJILandingGearModeNormal`. Only supported by Inspire 1 and Inspire 2. For Matrice 600 and
     * Matrice 600 Pro, the landing gear cannot be controlled through the SDK, only automatically
     * by the aircraft or manually by the remote controller.
     * @param callback  The execution callback with the execution result returned.
     */
    public void retractLandingGear(DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Turns off the self-adaptive landing gear. If self-adaptive landing gear is turned off, the
     * aircraft will not automatically lower and raise the landing gear when the aircraft is
     * 0.5m above the ground.
     * @param callback  The execution callback with the execution result returned.
     */
    public void turnOffAutoLandingGear(DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Turns on the self-adaptive landing gear. If self-adaptive landing gear is turned on the
     * landing Gear automatically transitions between deployed and retracted depending on altitude.
     * During take-off, the transition point is 1.2m above ground. After take-off (during flight or
     * when landing), the transition point is 0.5m above ground.
     * @param callback  The execution callback with the execution result returned.
     */
    public void turnOnAutoLandingGear(DJICommonCallbacks.DJICompletionCallback callback)
    {

    }
}

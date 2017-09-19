package dji.sdk.flightcontroller;

import dji.common.flightcontroller.DJIFlightControllerControlMode;
import dji.common.flightcontroller.DJIFlightControllerCurrentState;
import dji.common.flightcontroller.DJIFlightControllerRemoteControllerFlightMode;
import dji.common.flightcontroller.DJIFlightFailsafeOperation;
import dji.common.flightcontroller.DJIFlightOrientationMode;
import dji.common.flightcontroller.DJIIMUState;
import dji.common.flightcontroller.DJILocationCoordinate2D;
import dji.common.flightcontroller.DJIVirtualStickFlightControlData;
import dji.common.flightcontroller.DJIVirtualStickFlightCoordinateSystem;
import dji.common.flightcontroller.DJIVirtualStickRollPitchControlMode;
import dji.common.flightcontroller.DJIVirtualStickVerticalControlMode;
import dji.common.flightcontroller.DJIVirtualStickYawControlMode;
import dji.common.util.DJICommonCallbacks;
import dji.sdk.flightcontroller.rtk.DJIRtk;
import dji.sdk.sdkmanager.DJISDKManager;

/**
 *
 */

public abstract class DJIFlightController
{
    public DJIFlightController()
    {

    }

    /**
     * Starts auto-landing of the aircraft
     * @param callback
     */
    public abstract void autoLanding(DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void cancelAutoLanding(DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void cancelGoHome(DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void cancelTakeOff(DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void confirmLanding(DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void disableVirtualStickControlMode(DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void enableVirtualStickControlMode(DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Compass object.
     * @return
     */
    public DJICompass getCompass()
    {
        return null;
    }

    public abstract void getControlMode(DJICommonCallbacks.DJICompletionCallbackWith<DJIFlightControllerControlMode> callback);

    public DJIFlightControllerCurrentState getCurrentState()
    {
        return null;
    }

    public String getFlightControllerVersion()
    {
        return "";
    }

    public abstract void getFlightFailsafeOperation(DJICommonCallbacks.DJICompletionCallbackWith<DJIFlightFailsafeOperation> callback);

    public DJIFlightLimitation getFlightLimitation()
    {
        return null;
    }

    public abstract void getGoHomeAltitude(DJICommonCallbacks.DJICompletionCallbackWith<Float> callback);

    public abstract void getGoHomeBatteryThreshold(DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback);

    public abstract void getHomeLocation(DJICommonCallbacks.DJICompletionCallbackWith<DJILocationCoordinate2D> callback);

    public DJIVirtualStickFlightCoordinateSystem getHorizontalCoordinateSystem()
    {
        return null;
    }

    public DJIIntelligentFlightAssistant getIntelligentFlightAssistant()
    {
        return null;
    }

    public abstract void getLEDsEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback);

    public abstract void getLandImmediatelyBatteryThreshold(DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback);

    public DJILandingGear getLandingGear()
    {
        return null;
    }

    public abstract void getMultiSideIMUCalibrationStatus(DJICommonCallbacks.DJICompletionCallbackWith<DJIIMUState> callback);

    public abstract int getNumberOfIMUs();

    public abstract void getQuickSpinEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback);

    public abstract void getRemoteControllerFlightModeMappingWithCompletion(DJICommonCallbacks.DJICompletionCallbackWith<DJIFlightControllerRemoteControllerFlightMode[]> callback);

    public DJIVirtualStickRollPitchControlMode getRollPitchControlMode()
    {
        return null;
    }

    public DJIVirtualStickFlightCoordinateSystem getRollPitchCoordinateSystem()
    {
        return null;
    }

    public DJIRtk getRtk()
    {
        return null;
    }

    public DJISimulator getSimulator()
    {
        return null;
    }

    public abstract void getTerrainFollowModeEnable(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback);

    public abstract void getTripodModeEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback);

    public DJIVirtualStickVerticalControlMode getVerticalControlMode()
    {
        return null;
    }

    public boolean getVirtualStickAdvancedModeEnabled()
    {
        return false;
    }

    public DJIVirtualStickYawControlMode getYawControlMode()
    {
        return null;
    }

    public abstract void goHome(DJICommonCallbacks.DJICompletionCallback callback);

    public abstract boolean isIntelligentFlightAssistantSupported();

    public abstract void isLandingConfirmationNeeded(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback);

    public abstract boolean isLandingGearMovable();

    public abstract boolean isOnboardSDKDeviceAvailable();

    public abstract boolean isRtkSupported();

    public abstract boolean isVirtualStickControlModeAvailable();

    public abstract void lockCourseUsingCurrentDirection(DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void sendDataToOnboardSDKDevice(byte[] data, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void sendVirtualStickFlightControlData(DJIVirtualStickFlightControlData controlData, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setAutoQuickSpinEnabled(Boolean enabled, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setControlMode(DJIFlightControllerControlMode controlMode, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setFlightFailsafeOperation(DJIFlightFailsafeOperation operation, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setFlightOrientationMode(DJIFlightOrientationMode type, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setGoHomeAltitude(float altitude, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setGoHomeBatteryThreshold(int param, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setHomeLocation(DJILocationCoordinate2D homePoint, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setHomeLocationUsingAircraftCurrentLocation(DJICommonCallbacks.DJICompletionCallback callback);

    public void setHorizontalCoordinateSystem(DJIVirtualStickFlightCoordinateSystem rollPitchCoordinateSystem)
    {

    }

    public abstract void setLEDsEnabled(boolean enabled, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setLandImmediatelyBatteryThreshold(int param, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setOnIMUStateChangedCallback(DJIFlightControllerDelegate.FlightControllerIMUStateChangedCallback callback);

    public void setReceiveExternalDeviceDataCallback(DJIFlightControllerDelegate.FlightControllerReceivedDataFromExternalDeviceCallback callback)
    {

    }

    public void setReceivedNoFlyZoneCallback(DJIFlightControllerDelegate.ReceivedNoFlyZoneFromFlightControllerCallback callback)
    {

    }

    public void setRollPitchControlMode(DJIVirtualStickRollPitchControlMode rollPitchControlMode)
    {

    }

    public abstract void setTerrainFollowModeEnabled(Boolean enabled, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setTripodModeEnabled(Boolean enabled, DJICommonCallbacks.DJICompletionCallback callback);

    public void setUpdateSystemStateCallback(DJIFlightControllerDelegate.FlightControllerUpdateSystemStateCallback callback)
    {

    }

    public void setVerticalControlMode(DJIVirtualStickVerticalControlMode verticalControlMode)
    {

    }

    public void setVirtualStickAdvancedModeEnabled(boolean virtualStickAdvancedModeEnabled)
    {

    }

    public void setYawControlMode(DJIVirtualStickYawControlMode yawControlMode)
    {

    }

    public abstract void startIMUCalibration(DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void startIMUCalibration(int index, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Starts aircraft takeoff. Takeoff is considered complete when the aircraft is hovering 1.2 meters (4 feet) above the ground.
     * DJICompletionCallback is called when the aircraft crosses 0.5 meters (1.6 feet).
     * If the motors are already on, this command cannot be executed.
     * @param callback  	The execution callback with the returned execution result.
     */
    public abstract void takeOff(DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Turns off the aircraft's motors. The method can only be called when the aircraft is on the ground.
     * @param callback  The execution callback with the returned execution result.
     */
    public abstract void turnOffMotors(DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Turns on the aircraft's motors. Currently this is only supported by the M100.
     * @param callback  The execution callback with the returned execution result.
     */
    public abstract void turnOnMotors(DJICommonCallbacks.DJICompletionCallback callback);
}

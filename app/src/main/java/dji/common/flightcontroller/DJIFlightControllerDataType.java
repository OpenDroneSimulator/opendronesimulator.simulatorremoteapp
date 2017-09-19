package dji.common.flightcontroller;

/**
 * This class provides the data type for flight controller.
 */

public class DJIFlightControllerDataType
{
    /**
     * Roll/Pitch control angle MAX value 30 degrees.
     */
    public static final float DJIVirtualStickRollPitchControlMaxAngle = 30.0f;
    /**
     * Roll/Pitch control velocity MAX value 15m/s.
     */
    public static final float DJIVirtualStickRollPitchControlMaxVelocity = 15.0f;
    /**
     * Roll/Pitch control angle MIN value -30 degrees.
     */
    public static final float DJIVirtualStickRollPitchControlMinAngle = -30.0f;
    /**
     * Roll/Pitch control velocity MIN value -15m/s.
     */
    public static final float DJIVirtualStickRollPitchControlMinVelocity = -15.0f;
    /**
     * Vertical control position MAX for VirtualStickVerticalControlModePosition. Currently set at 500m.
     */
    public static final float DJIVirtualStickVerticalControlMaxPosition = 500.0f;
    /**
     * Vertical control velocity MAX value 4 m/s in VirtualStickControlMode. Positive velocity is up.
     */
    public static final float DJIVirtualStickVerticalControlMaxVelocity = 4.0f;
    /**
     * Vertical control position MIN for VirtualStickVerticalControlModePosition. Currently set at 0m.
     */
    public static final float DJIVirtualStickVerticalControlMinPosition = 0.0f;
    /**
     * Vertical control velocity MIN value -4 m/s in VirtualStickControlMode. Positive velocity is up.
     */
    public static final float DJIVirtualStickVerticalControlMinVelocity = -4.0f;
    /**
     * Yaw control angle MAX value 180 degrees.
     */
    public static final float DJIVirtualStickYawControlMaxAngle = 180.0f;
    /**
     * Yaw control angular velocity MAX value 100 degree/s.
     */
    public static final float DJIVirtualStickYawControlMaxAngularVelocity = 100.0f;
    /**
     * Yaw control angle MIN value -180 degrees.
     */
    public static final float DJIVirtualStickYawControlMinAngle = -180.0f;
    /**
     * Yaw control angular velocity MIN value -100 degree/s.
     */
    public static final float DJIVirtualStickYawControlMinAngularVelocity = -100.0f;

    public DJIFlightControllerDataType()
    {

    }
}

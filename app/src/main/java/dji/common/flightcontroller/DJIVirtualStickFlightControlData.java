package dji.common.flightcontroller;

/**
 *
 *
 * Contains all the virtual stick control data needed to move the aircraft in all directions
 */

public class DJIVirtualStickFlightControlData
{
    private float _pitch;
    private float _roll;
    private float _yaw;
    private float _throttle;

    /**
     *
     * @param pPitch    Pitch value.
     * @param pRoll     Roll value.
     * @param pYaw      Yaw value.
     * @param pThrottle Throttle value.
     */
    public DJIVirtualStickFlightControlData(float pPitch, float pRoll, float pYaw, float pThrottle)
    {
        _pitch = pPitch;
        _roll = pRoll;
        _yaw = pYaw;
        _throttle = pThrottle;
    }

    /**
     * Gets Velocity (m/s) or Angle (degrees) value for pitch. Use DJIVirtualStickRollPitchControlMode to set velocity or angle mode.
     * @return
     */
    public float getPitch()
    {
        return _pitch;
    }

    /**
     * Gets Velocity (m/s) or Angle (degrees) value for roll. Use DJIVirtualStickRollPitchControlMode to set velocity or angle mode.
     * @return
     */
    public float getRoll()
    {
        return _roll;
    }

    /**
     * Gets Velocity (m/s) or Alititude (m) value for verticalControl. Use DJIVirtualStickVerticalControlMode to set velocity or altitude mode.
     * @return
     */
    public float getVerticalThrottle()
    {
        return _throttle;
    }

    /**
     * Gets Angular Velocity (degrees/s) or Angle (degrees) value for yaw. Use DJIVirtualStickYawControlMode to set angular velocity or angle mode.
     * @return
     */
    public float getYaw()
    {
        return _yaw;
    }

    /**
     * Sets Velocity (m/s) or Angle (degrees) value for pitch. Use DJIVirtualStickRollPitchControlMode to set velocity or angle mode.
     * @param pPitch    the value to be set.
     */
    public void setPitch(float pPitch)
    {
        _pitch = pPitch;
    }

    /**
     * Sets Velocity (m/s) or Angle (degrees) value for roll. Use DJIVirtualStickRollPitchControlMode to set velocity or angle mode.
     * @param pRoll the value to be set.
     */
    public void setRoll(float pRoll)
    {
        _roll = pRoll;
    }

    /**
     * Sets Velocity (m/s) or Alititude (m) value for verticalControl. Use DJIVirtualStickVerticalControlMode to set velocity or altitude mode.
     * @param pThrottle
     */
    public void setVerticalThrottle(float pThrottle)
    {
        _throttle = pThrottle;
    }

    /**
     * Sets Angular Velocity (degrees/s) or Angle (degrees) value for yaw. Use DJIVirtualStickYawControlMode to set angular velocity or angle mode.
     * @param pYaw  the value to be set.
     */
    public void setYaw(float pYaw)
    {
        _yaw = pYaw;
    }
}

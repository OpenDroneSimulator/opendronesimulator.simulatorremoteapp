package dji.common.flightcontroller;

/**
 *
 */

public class DJIFlightControllerCurrentState
{
    public DJIFlightControllerCurrentState()
    {

    }

    /**
     * true if motors are on.
     * @return
     */
    public boolean areMotorsOn()
    {
        return false;
    }

    /**
     * This method is deprecated. Use the DJICompass.getHeading() method instead.
     * @return
     */
    public int getAircraftHeadDirection()
    {
        return 0;
    }

    /**
     * Gets the current location of the aircraft as a coordinate. The altitude is relative to take off location, measured by the barometer, in meters.
     * @return  The current location of the aircraft as a coordinate.
     */
    public DJILocationCoordinate3D getAircraftLocation()
    {
        return null;
    }

    /**
     * Gets the attitude of the aircraft where the pitch, roll, and yaw values will be in the range
     * of [-180, 180] degrees. If the values of the pitch, roll, and yaw are 0, the aircraft will
     * be hovering level with a True North heading.
     * @return  The attitude of the aircraft.
     */
    public DJIAttitude getAttitude()
    {
        return null;
    }

    /**
     * Gets the flight controller flight mode. For more info, see
     * http://wiki.dji.com/en/index.php/Phantom_3_Professional-Aircraft
     * @return  The flight controller flight mode.
     */
    public DJIFlightControllerFlightMode getFlightMode()
    {
        return null;
    }

    /**
     * Gets the flight mode as a string.
     * @return  The flight mode as a string. For example, "P-GPS" or "P-Atti".
     */
    public String getFlightModeString()
    {
        return "";
    }

    /**
     * Returns the flight time.
     * @return
     */
    public int getFlightTime()
    {
        return 0;
    }

    /**
     * Gets the height when the aircraft is going home in meters.
     * @return  The height when the aircraft is going home.
     */
    public int getGoHomeHeight()
    {
        return 0;
    }

    /**
     * Return the DJIGoHomeStatus object.
     * @return
     */
    public DJIGoHomeStatus getGoHomeStatus()
    {
        return null;
    }

    /**
     * Gets the aircraft's current GPS signal quality.
     * @return      The aircraft's current GPS signal quality.
     */
    public DJIGPSSignalStatus getGpsSignalStatus()
    {
        return null;
    }

    /**
     * Returns the home location of the aircraft as a coordinate.
     * @return
     */
    public DJILocationCoordinate2D getHomeLocation()
    {
        return null;
    }

    /**
     * This method is deprecated. Home point altitude is meaningless.
     * @return
     */
    public float getHomePointAltitude()
    {
        return 0;
    }

    /**
     * Returns the aircraft's current no fly status.
     * @return
     */
    public DJIFlightControllerNoFlyStatus getNoFlyStatus()
    {
        return null;
    }

    /**
     * Returns no fly zone's center coordinate.
     * @return
     */
    public DJILocationCoordinate2D getNoFlyZoneCenter()
    {
        return null;
    }

    /**
     * Gets the no fly zone's radius.
     * @return
     */
    public double getNoFlyZoneRadius()
    {
        return 0;
    }

    /**
     * Returns the orientation mode.
     * @return
     */
    public DJIFlightOrientationMode getOrientationMode()
    {
        return null;
    }

    /**
     * Recommended action based on remaining battery life.
     * @return
     */
    public DJIAircraftRemainingBatteryState getRemainingBattery()
    {
        return null;
    }

    /**
     * Returns the GPS satellite count.
     * @return  The GPS satellite count.
     */
    public double getSatelliteCount()
    {
        return 0;
    }

    /**
     * Gets the aircraft's smart go home data. If smart go home is enabled, all the smart go home
     * data will be available in DJIFlightControllerSmartGoHomeStatus.
     * @return  The aircraft's smart go home data.
     */
    public DJIFlightControllerSmartGoHomeStatus getSmartGoHomeStatus()
    {
        return null;
    }

    /**
     * Height of aircraft measured by the ultrasonic sensor in meters. The data will only be
     * available if isUltrasonicBeingUsed returns true. Height has a precision of 0.1m.
     * @return  The height of the aircraft measured by the ultrasonic sensor in meters.
     */
    public float getUltrasonicHeight()
    {
        return 0f;
    }

    /**
     * Current speed of the aircraft in the x direction in meters per second using North-East-Down coordinate system.
     * @return
     */
    public float getVelocityX()
    {
        return 0f;
    }

    /**
     * Current speed of the aircraft in the y direction in meters per second using North-East-Down coordinate system.
     * @return
     */
    public float getVelocityY()
    {
        return 0f;
    }

    /**
     * Current speed of the aircraft in the z direction in meters per second using North-East-Down coordinate system.
     * @return
     */
    public float getVelocityZ()
    {
        return 0f;
    }

    /**
     * true if fail safe is enabled for when the signal is lost between remote controller and aircraft.
     * @return
     */
    public boolean isFailsafe()
    {
        return false;
    }

    /**
     * true if aircraft is flying.
     * @return
     */
    public boolean 	isFlying()
    {
        return false;
    }

    /**
     * true if the aircraft is going home.
     * @return
     */
    public boolean isGoingHome()
    {
        return false;
    }

    /**
     * true if the home point has been set.
     * @return
     */
    public boolean 	isHomePointSet()
    {
        return false;
    }

    /**
     * true if IMU is preheating.
     * @return
     */
    public boolean isIMUPreheating()
    {
        return false;
    }

    /**
     * true if the clearance between the aircraft and the ground is less than 0.3m and confirmation
     * from the user is needed to continue the landing. When the confirmation is needed, user can
     * use method, confirmLanding, in DJIFlightController to continue the landing. It is supported
     * by flight controller firmware 3.2.0.0 or above.
     * @return
     */
    public boolean isLandingConfirmationNeeded()
    {
        return false;
    }

    /**
     * Determines whether multiple flight modes are open. This will reflect whether the navigation
     * mode (ground station) is enabled.
     * @return  true if the navigation mode is enabled
     */
    public boolean isMultipModeOpen()
    {
        return false;
    }

    /**
     * true if the aircraft has reached the flight limit height.
     * @return
     */
    public boolean isReachLimitedHeight()
    {
        return false;
    }

    /**
     * true if the aircraft has reached the flight limit radius.
     * @return
     */
    public boolean isReachLimitedRadius()
    {
        return false;
    }

    /**
     * true if the ultrasonic sensor is being used. Variables that can impact the quality of the
     * ultrasonic measurement and whether it is used or not are height above ground and the type of
     * ground (if it reflects sound waves well). Usually the ultrasonic sensor works when the
     * aircraft is less than 8m above ground.
     * @return
     */
    public boolean isUltrasonicBeingUsed()
    {
        return false;
    }

    /**
     * Returns whether or not the ultrasonic is used.
     * This method is deprecated. Please refer to the DJIDiagnosis.
     * @return
     */
    public boolean isUltrasonicError()
    {
        return false;
    }

    /**
     * true if vision sensor is being used. Variables that can impact the quality of the vision
     * measurement and whether it is used or not are height above ground and the type of ground
     * (if it has sufficiently rich texture). Usually the vision sensor works when the aircraft
     * is less than 3m above ground.
     * @return
     */
    public boolean isVisionSensorBeingUsed()
    {
        return false;
    }

    public void setFlightTime(int time)
    {

    }

    public void setNeedConfirmLanding(boolean needForceLanding)
    {

    }

    /**
     * Set the velocity X.
     * @param pVelocityX
     */
    public void setVelocityX(float pVelocityX)
    {

    }

    public String toString()
    {
        return "";
    }
}

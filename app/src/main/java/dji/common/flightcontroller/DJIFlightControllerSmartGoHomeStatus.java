package dji.common.flightcontroller;

/**
 *
 */

public class DJIFlightControllerSmartGoHomeStatus
{
    public DJIFlightControllerSmartGoHomeStatus()
    {
    }

    /**
     * The estimated battery percentage, in the range of [0 - 100], needed for the aircraft to go home.
     * This includes landing of the aircraft.
     */
    public int getBatteryPercentageNeededToGoHome()
    {
        return 0;
    }

    /**
     * The maximum radius, in meters, an aircraft can fly from its home location and still make it
     * all the way back home based on certain factors including altitude, distance, battery, etc.
     * If the aircraft goes out farther than the max radius, it will fly as far back home as it
     * can and land.If the aircraft is using the simulator, this value will be 0.
     * @return
     */
    public float getMaxRadiusAircraftCanFlyAndGoHome ()
    {
        return 0;
    }

    /**
     * The estimated remaining time, in seconds, it will take the aircraft to go home with a 10% battery buffer remaining.
     * This time includes landing the aircraft. If the aircraft is using the simulator, this value will be 0.
     * @return
     */
    public int getRemainingFlightTime ()
    {
        return 0;
    }

    /**
     * The estimated time, in seconds, needed for the aircraft to go home from its current location.
     * @return
     */
    public int getTimeNeededToGoHome ()
    {
        return 0;
    }

    /**
     * The estimated time, in seconds, needed for the aircraft to land from its current height.
     * The time calculated will be for the aircraft to land, moving straight down, from its current height.
     * @return
     */
    public int getTimeNeededToLandFromCurrentHeight ()
    {
        return 0;
    }

    /**
     * Returns whether or not the aircraft is requesting to go home. If the value of aircraftShouldGoHome is true
     * and the user does not respond after 10 seconds, the aircraft will automatically go back to its home location.
     * It is recommended that an alert view is shown to the user when aircraftShouldGoHome returns true. During this time,
     * the Remote Controller will beep. The flight controller calculates whether or not the aircraft should go home based on the aircraft's altitude,
     * distance, battery, etc. The two main situations in which aircraftShouldGoHome will return true are if the aircraft's battery is too low or if
     * the aircraft has flown too far away.
     * @return
     */
    public boolean isAircraftShouldGoHome ()
    {
        return false;
    }
}

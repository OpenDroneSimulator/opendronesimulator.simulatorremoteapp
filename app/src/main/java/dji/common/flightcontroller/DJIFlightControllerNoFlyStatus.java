package dji.common.flightcontroller;

/**
 * This will return the status of the aircraft whether the aircraft is near the no fly zone or not.
 */

public enum DJIFlightControllerNoFlyStatus
{
    ApproachingNoFlyZone, FlyingNormally, ForceAutoLanding, HeightLimited, ReachMaxFlyingDistance,
    ReachMaxFlyingHeight, TakeOffProhibited, UnderLimitFlyZone, UnknownStatus;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIFlightControllerNoFlyStatus find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

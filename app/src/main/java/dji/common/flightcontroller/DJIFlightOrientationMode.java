package dji.common.flightcontroller;

/**
 *
 *
 * Tells the aircraft how to interpret flight commands for forward, backward, left and right.
 * Additional information should be seen in the getting started guide.
 */

public enum DJIFlightOrientationMode
{
    CourseLock  , DefaultAircraftHeading , HomeLock ;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIFlightOrientationMode find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

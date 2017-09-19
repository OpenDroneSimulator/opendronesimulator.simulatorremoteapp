package dji.common.flightcontroller;

/**
 *
 *
 * This will return the status of the aircraft whether the aircraft is near the no fly zone or not.
 */

public enum DJIVirtualStickFlightCoordinateSystem
{
    Body, Ground;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIVirtualStickFlightCoordinateSystem find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

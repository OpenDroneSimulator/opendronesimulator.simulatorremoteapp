package dji.common.flightcontroller;

/**
 *
 */

public enum DJIFlightFailsafeOperation
{
    GoHome , Hover, Landing,Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIFlightFailsafeOperation find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

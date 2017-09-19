package dji.common.flightcontroller;

/**
 *
 */

public enum DJILandingGearMode
{
    Auto , Normal, OTHER, Transport;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJILandingGearMode find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

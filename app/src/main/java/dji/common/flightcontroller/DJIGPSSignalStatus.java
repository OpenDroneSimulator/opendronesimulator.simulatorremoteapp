package dji.common.flightcontroller;

/**
 *
 *
 * A enum class representing GPS signal levels, which are used to measure the signal quality.
 */

public enum DJIGPSSignalStatus
{
    Level0 , Level1, Level2, Level3, Level4, Level5, None;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIGPSSignalStatus find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

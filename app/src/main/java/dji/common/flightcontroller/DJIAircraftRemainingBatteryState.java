package dji.common.flightcontroller;

/**
 *
 *
 * Remaining battery life state. This state describes the recommended action based on remaining battery life.
 */

public enum DJIAircraftRemainingBatteryState
{
    Low  , Normal , Reserved , VeryLow;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIAircraftRemainingBatteryState find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

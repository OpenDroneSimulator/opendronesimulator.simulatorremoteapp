package dji.common.flightcontroller;

/**
 *
 */

public enum DJIFlightControllerControlMode
{
    Manual , Smart, Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIFlightControllerControlMode find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

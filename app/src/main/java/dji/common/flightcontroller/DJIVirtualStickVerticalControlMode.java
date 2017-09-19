package dji.common.flightcontroller;

/**
 *
 */

public enum DJIVirtualStickVerticalControlMode
{
    Position , Velocity;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIVirtualStickVerticalControlMode find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

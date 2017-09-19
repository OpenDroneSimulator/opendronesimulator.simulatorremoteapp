package dji.common.flightcontroller;

/**
 *
 *
 * Defines how manual yaw values are interpreted by the aircraft.
 */

public enum DJIVirtualStickYawControlMode
{
    Angle, AngularVelocity;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIVirtualStickYawControlMode find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

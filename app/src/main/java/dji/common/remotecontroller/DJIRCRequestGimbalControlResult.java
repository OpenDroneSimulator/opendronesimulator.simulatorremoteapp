package dji.common.remotecontroller;

/**
 *
 *
 * Result when a slave requests permission to control the gimbal.
 */

public enum DJIRCRequestGimbalControlResult
{
    Agree,Authorized, Deny, Timeout, Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIRCRequestGimbalControlResult find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

package dji.common.remotecontroller;

/**
 *
 */

public enum DJIRCGimbalControlDirection
{
    Pitch, Roll, Yaw;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIRCGimbalControlDirection find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

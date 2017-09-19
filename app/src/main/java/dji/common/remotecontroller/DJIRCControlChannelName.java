package dji.common.remotecontroller;

/**
 *
 * Remote Controller control channels. These will be used in RC Custom Control Style. See RCControlStyle.Custom and RCControlStyle.SlaveCustom.
 */

public enum DJIRCControlChannelName
{
    Pitch, Roll, Throttle, Yaw;

    public boolean _equals(int b)
    {
        return true;
    }

    public static DJIRCControlChannelName find(int value)
    {
        return null;
    }

    public int value ()
    {
        return 0;
    }
}



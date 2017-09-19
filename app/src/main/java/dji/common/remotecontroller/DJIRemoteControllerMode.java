package dji.common.remotecontroller;

/**
 *
 * Remote Controller mode of operation can be normal (single RC connected to aircraft), master, slave, or unknown
 */
public enum DJIRemoteControllerMode
{
    Master, Normal, Slave, Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIRemoteControllerMode find (int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

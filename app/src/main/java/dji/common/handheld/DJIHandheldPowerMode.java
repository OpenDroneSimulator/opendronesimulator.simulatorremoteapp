package dji.common.handheld;

/**
 *
 */

public enum DJIHandheldPowerMode
{
    Awake, PowerOff, Sleeping, Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIHandheldPowerMode find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

package dji.common.airlink;

/**
 *
 */

public enum DJIWiFiSignalQuality
{
    Good, Medium, Unknown, bad;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIWiFiSignalQuality find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

package dji.common;

/**
 *
 * Secondary output video resolution and frame rate.
 */

public enum LBAirLinkSecondaryVideoFormat
{
    Resolution1080I50FPS, Resolution1080I60FPS, Resolution1080P24FPS, Resolution1080P25FPS,
    Resolution1080P30FPS, Resolution1080P50FPS, Resolution1080P60FPS, Resolution720P24FPS,
    Resolution720P25FPS, Resolution720P30FPS, Resolution720P50FPS, Resolution720P60FPS, Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static LBAirLinkSecondaryVideoFormat find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

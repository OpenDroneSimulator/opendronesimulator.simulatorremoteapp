package dji.common;

/**
 *
 */

public enum LBAirLinkEncodeMode
{
    /**
     * Dual encode mode. Lightbridge 2 will encode the video input from both the AV port and the HDMI port.
     */
    Dual  ,
    /**
     * Single encode mode. Lightbridge 2 will only encode the video input from either the AV port or the HDMI port.
     */
    Single ,

    /**
     * Unknown p
     */
    Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static LBAirLinkEncodeMode find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

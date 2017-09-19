package dji.common.airlink;

/**
 *
 */

public enum LBAirLinkFPVVideoQualityLatency
{
    /**
     * High quality priority.
     */
    HighQuality  ,
    /**
     * Low latency priority.
     */
    LowLatency ,

    /**
     * 	Unknown transmission priority.
     */
    Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static LBAirLinkFPVVideoQualityLatency find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

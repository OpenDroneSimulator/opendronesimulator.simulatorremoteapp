package dji.common.airlink;

/**
 *
 */

public enum LBAirLinkFrequencyBand
{
    /**
     * The video signal frequency band is 2.4 GHz.
     */
    FrequencyBand2Dot4G  ,
    /**
     * The video signal frequency band is 5.7 GHz.
     */
    FrequencyBand5Dot7G ,

    /**
     * The video signal frequency band is 5.8 GHz.
     */
    FrequencyBand5Dot8G ,
    /**
     * The video signal frequency is unknown.
     */
    Unknown ;

    public boolean _equals (int b)
    {
        return true;
    }

    public static LBAirLinkFrequencyBand find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

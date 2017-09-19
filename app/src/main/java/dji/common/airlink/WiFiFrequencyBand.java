package dji.common.airlink;

/**
 *
 *
 * WiFi frequency band.
 */

public enum WiFiFrequencyBand
{
    /**
     * The WiFi frequency band is 2.4 GHz.
     */
    FrequencyBand2Dot4G ,
    /**
     * The WiFi frequency band is 5 GHz.
     */
    FrequencyBand5G ,
    /**
     * Dual frequency band mode. The WiFi frequency band can be either 2.4 GHz or 5 GHz.
     */
    FrequencyBandDual ,

    /**
     * The WiFi Frequency is unknown.
     */
    Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static WiFiFrequencyBand find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

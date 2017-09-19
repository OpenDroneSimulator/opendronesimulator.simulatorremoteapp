package dji.common.airlink;

/**
 *
 */

public enum LBAirLinkDataRate
{
    /**
     * 10 Mbps (Potential range up to 0.7 km)
     */
    Bandwidth10Mbps  ,
    /**
     * 4 Mbps (Potential range up to 3 km)
     */
    Bandwidth4Mbps ,

    /**
     * 6 Mbps (Potential range up to 2 km)
     */
    Bandwidth6Mbps ,
    /**
     * 8 Mbps (Potential range up to 1.5 km)
     */
    Bandwidth8Mbps ,
    /**
     * Unknown
     */
    Unknown ;

    public boolean _equals (int b)
    {
        return true;
    }

    public static LBAirLinkDataRate find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

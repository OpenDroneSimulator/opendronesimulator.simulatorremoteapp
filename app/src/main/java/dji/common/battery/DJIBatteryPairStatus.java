package dji.common.battery;

/**
 *
 *
 * Battery pairing state for batteries that can be paired. Only supported by Inspire 2.
 */

public enum DJIBatteryPairStatus
{
    /**
     * Batteries are paired.
     */
    PAIRED   ,
    /**
     * Unknown.
     */
    UNKNOWN  ,

    /**
     * The batteries are unpaired.
     */
    Unpaired ;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIBatteryPairStatus find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

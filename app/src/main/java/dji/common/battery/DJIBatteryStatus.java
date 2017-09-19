package dji.common.battery;

import dji.sdk.battery.DJIBattery;

/**
 *
 *
 * Battery pairing state for batteries that can be paired. Only supported by Inspire 2.
 */

public enum DJIBatteryStatus
{
    /**
     * Exception
     */
    EXCEPTION   ,
    /**
     * Invalid.
     */
    INVALID  ,

    /**
     * Normal
     */
    NORMAL,

    /**
     * Other
     */
    OTHER
    ;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIBatteryStatus find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }

}

package dji.common.battery;

/**
 *
 *
 * Defines aircraft operation when the cell voltage is low. It is only supported when the connected product is stand-alone A3 and N3.
 */

public enum DJIBatteryLowCellVoltageOperation
{
    /**
     * Return-to-Home
     */
    GoHome    ,
    /**
     * LED lights go into warning mode  .
     */
    LEDWarning   ,

    /**
     * Land aircraft immediately
     */
    Landing,
    /**
     * Unknown
     */
    Unknown ;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIBatteryLowCellVoltageOperation find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

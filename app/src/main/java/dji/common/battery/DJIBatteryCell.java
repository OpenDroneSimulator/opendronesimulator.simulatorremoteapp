package dji.common.battery;

/**
 *
 *
 * Class that contains battery cell voltage data.
 */

public class DJIBatteryCell
{
    private int _voltage;

    /**
     * Returns the battery cell object with the initialized voltage.
     * @param voltage       Voltage value to be set for the cell.
     */
    public DJIBatteryCell (int voltage)
    {
        _voltage = voltage;
    }

    /**
     * Returns the voltage (unit:mV) of the current battery cell.
     * @return
     */
    public int getVoltage ()
    {
        return _voltage;
    }
}

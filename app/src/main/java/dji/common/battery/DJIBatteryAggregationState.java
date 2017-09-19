package dji.common.battery;

/**
 *
 *
 * Provides a real time summary of the aggregated battery system. Only supported by Matrice 600, Matrice 600 Pro and Inspire 2.
 */

public class DJIBatteryAggregationState
{
    public DJIBatteryAggregationState ()
    {

    }

    /**
     * true if one of the batteries in the group has a firmware version different from the others. When it is true, the aircraft is not allow to take off.
     * @return
     */
    public boolean firmwareDifferenceDetected ()
    {
        return false;
    }

    /**
     * true if one of the batteries in the group is disconnected. When it is true, the aircraft is not allowed to take off.
     * @return
     */
    public boolean getBatteryDisconnected ()
    {
        return false;
    }

    /**
     * Returns the overview of batteries in the battery group. When a battery is not connected,
     * the `isConnected` property is `NO` and the `energyRemainingPercent` is zero.
     * For Matrice 600, there are 6 elements in `batteryOverviews`.
     * @return
     */
    public DJIBatteryOverview[] getBatteryOverviews ()
    {
        return null;
    }

    /**
     * Returns the real time current draw through the batteries. A negative value means the batteries are being discharged.
     * @return
     */
    public int getCurrentCurrent ()
    {
        return 0;
    }

    /**
     * Returns the remaining energy stored in the batteries in mAh (milliamp hours).
     * @return
     */
    public int getCurrentEnergy ()
    {
        return 0;
    }

    /**
     * Returns the current voltage (mV) provided by the battery group.
     * @return
     */
    public int getCurrentVoltage ()
    {
        return 0;
    }

    /**
     * Returns the percentage of energy left in the battery group with range [0 - 100].
     * @return
     */
    public int getEnergyRemainingPercent ()
    {
        return 0;
    }

    /**
     * Returns the the total amount of energy, in mAh (milliamp hours), stored in the batteries when the batteries are fully charged.
     * @return
     */
    public int getFullChargeEnergy ()
    {
        return 0;
    }

    /**
     * Returns the highest temperature (in Centigrade) among the batteries in the group, with a range [-128 to 127].
     * @return
     */
    public int getHighestBatteryTemperature ()
    {
        return 0;
    }

    /**
     * true if one of the batteries in the group has cells with low voltage. When it is true, the aircraft is not allow to take off.
     * @return
     */
    public boolean getLowCellVoltageDetected ()
    {
        return false;
    }

    /**
     * The number of currently connected batteries.
     * @return
     */
    public int getNumberOfConnectedBatteries ()
    {
        return 0;
    }

    /**
     * true if there is significant difference between the voltage (above 1.5V) of two batteries.
     * When it is true, the aircraft is not allowed to take off.
     * @return
     */
    public boolean getVoltageDifferenceDetected ()
    {
        return false;
    }

    /**
     * true if one of the batteries in the group has damaged cells.
     * When it is true, the aircraft is not allow to take off.
     * @return
     */
    public boolean hasDamagedCell ()
    {
        return false;
    }
}

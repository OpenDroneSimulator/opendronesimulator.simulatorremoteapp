package dji.common.battery;

/**
 *
 *
 * DJIBatteryState is used to keep track of the real-time state of the battery.
 * It is supported by both smart and non-smart batteries. However for non-smart batteries,
 * only some of the properties are valid: - When the connected product is A3 and N3,
 * only `currentVoltage` and `cellVoltageLevel` are valid. - When the connected product is A2,
 * only `currentVoltage` is valid.
 */

public class DJIBatteryState
{
    /**
     * Default constructor for DJIBatteryState.
     */
    public DJIBatteryState ()
    {

    }

    /**
     * Returns the percentage of battery power left. The range of this value is [0 - 100].
     * @return
     */
    public int getBatteryEnergyRemainingPercent ()
    {
        return 0;
    }

    /**
     * Returns the temperature of battery in Centigrade, with the range [-128 to 127].
     * @return
     */
    public float getBatteryTemperature ()
    {
        return 0f;
    }

    /**
     * Returns the real time current draw of the battery (mA).
     * A negative value means the battery is being discharged, and a positive value means it is being charged.
     * @return
     */
    public int getCurrentCurrent ()
    {
        return 0;
    }

    /**
     * Returns the remaining energy stored in the battery in mAh (milliamp hours).
     * @return
     */
    public int getCurrentEnergy ()
    {
        return 0;
    }

    /**
     * Returns the current battery voltage (mV).
     * @return
     */
    public int getCurrentVoltage ()
    {
        return 0;
    }

    /**
     * Returns the the total amount of energy, in mAh (milliamp hours),
     * stored in the battery when the battery is fully charged.
     * The energy of the battery at full charge changes over time as the battery continues to get used.
     * Over time, as the battery continues to be recharged, the value of fullChargeEnergy will decrease.
     * @return
     */
    public int getFullChargeEnergy ()
    {
        return 0;
    }

    /**
     * Returns the percentage of remaining lifetime value of the battery. The range of this value is [0 - 100].
     * @return
     */
    public int getLifetimeRemainingPercent ()
    {
        return 0;
    }

    /**
     * Returns the total number of discharges the battery has gone through over its lifetime.
     * The total number of discharges includes discharges that happen through normal use and discharges that are manually set.
     * @return
     */
    public int getNumberOfDischarge ()
    {
        return 0;
    }

    /**
     * true if the battery is being charged. It is only supported by Osmo Mobile.
     * @return
     */
    public boolean isBeingCharged ()
    {
        return false;
    }

    /**
     * true if only one battery is inserted to slot on the the right or starboard side of the aircraft.
     * The aircraft can still take off but the flight time will be shorter. It is only supported by Inspire 2.
     * Inspire 2 must always have a battery in the right or starboard slot.
     * @return
     */
    public boolean isInSingleBatteryMode ()
    {
        return false;
    }
}

package dji.common.battery;

/**
 *
 *
 * This class is used to keep a record of any unusual status for the battery in the past 30 discharge.
 * For all the properties below, monitor these values frequently to ensure the battery's state is normal.
 * If any of the properties below indicate there is an issue with the battery, we recommend notifying the user.
 *
 * NOTE: No automatic action will be taken if any of the properties below return true,
 * which is why it is imperative the user is notified of the issue. These states are not supported by Osmo.
 */
public class DJIBatteryWarningInformation
{
    public DJIBatteryWarningInformation(boolean currentOverload, boolean overHeating, boolean lowTemperature, boolean shortCircuit, boolean customDischargeEnabled, short underVoltageBatteryCellIndex, short damagedBatteryCellIndex)
    {

    }

    public DJIBatteryWarningInformation(long data)
    {

    }

    public DJIBatteryWarningInformation(int data)
    {

    }

    /**
     * Returns the index at which one of the cells in the battery is damaged. The first cell has an index of 1.
     * 0 represents no damaged battery cells. The Phantom 3 Series have 4 cell batteries. The Inspire series and M100 have 6 cell batteries.
     *
     * @return
     */
    public short getDamagedBatteryCellIndex()
    {
        return 0;
    }

    /**
     * Returns the index at which one of the cells in the battery is below the normal voltage.
     * The first cell has an index of 1. 0 represents no battery cells under voltage.
     * The Phantom 3 Series have 4 cell batteries. The Inspire series and M100 have 6 cell batteries.
     * @return
     */
    public short getUnderVoltageBatteryCellIndex()
    {
        return 0;
    }

    /**
     * Description : Has error
     * @return  true if has any error;
     */
    public boolean hasError ()
    {
        return false;
    }

    /**
     * true if the battery should be discharged due to a current overload.
     * @return
     */
    public boolean isCurrentOverload ()
    {
        return false;
    }

    /**
     * true if the battery has been configured to be discharged over a specific number of days.
     * Once the battery is fully charged again, the battery will discharge over the number of days set here again. This process is cyclical.
     * @return
     */
    public boolean isCustomDischargeEnabled ()
    {
        return false;
    }

    /**
     * true if the battery should be discharged due to a low temperature.
     * @return
     */
    public boolean isLowTemperature ()
    {
        return false;
    }

    /**
     * true if the battery should be discharged due to being overheated.
     * @return
     */
    public boolean isOverHeating ()
    {
        return false;
    }

    /**
     * true if the battery should be discharged due to being short circuited.
     * @return
     */
    public boolean isShortCircuit ()
    {
        return false;
    }
}

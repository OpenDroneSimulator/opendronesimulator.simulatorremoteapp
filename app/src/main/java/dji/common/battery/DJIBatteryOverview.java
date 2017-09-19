package dji.common.battery;

/**
 *
 *
 * Provides an overview of a battery - used when multiple batteries are deployed on one product.
 */

public class DJIBatteryOverview
{
    public DJIBatteryOverview ()
    {

    }

    /**
     * The remaining percentage energy of the battery with range [0,100].
     * @return
     */
    public int getEnergyRemainingPercent ()
    {
        return 0;
    }

    /**
     * Index of the battery. Index starts from 0. For Matrice 600, the number 1 battery compartment relates to index 0.
     * @return
     */
    public int getIndex ()
    {
        return 0;
    }

    /**
     * true if the battery is currently connected to the aircraft.
     * @return
     */
    public boolean isConnected ()
    {
        return false;
    }

    public void setEnergyRemainingPercent (int energyRemainingPercent)
    {

    }

    public void setIndex (int index)
    {

    }

    public void setIsConnected (boolean isConnected)
    {

    }
}

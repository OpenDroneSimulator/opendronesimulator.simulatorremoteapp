package dji.sdk.battery;

import java.util.List;

/**
 *
 */

public class DJIBatteryCheckHelper
{
    public static class BanSN
    {
        public List<String> invalid_battery_sn_list;
        public int status;

        public BanSN()
        {

        }
    }

    public interface DJIBatteryCheckListener
    {
        public abstract void onBatteryBanListUpdate (DJIBatteryCheckHelper.BanSN banSN);
        public abstract void onInvalidBatteryFound ();
    }

    public static final String SHARE_PREFERENCE_KEY = "";

    public boolean addListener (DJIBatteryCheckHelper.DJIBatteryCheckListener listener)
    {
        return false;
    }

    public boolean checkIsBatteryValid ()
    {
        return false;
    }

    public void clearListener ()
    {

    }

    public static DJIBatteryCheckHelper getInstance ()
    {
        return null;
    }

    public boolean removeListener (DJIBatteryCheckHelper.DJIBatteryCheckListener listener)
    {
        return false;
    }

    public void setDebugging (boolean isDebugging)
    {

    }

    public void startListenToConnectionChange ()
    {

    }

    public void stopListenToConnectionChange ()
    {

    }

    public synchronized boolean updateBanBatteryList (int retryNum) throws InterruptedException
    {
        return false;
    }

    public synchronized boolean updateBanBatteryListFromServer (int retryNum) throws InterruptedException
    {
        return false;
    }

    public synchronized boolean updateBanBatteryListLocally ()
    {
        return false;
    }

    public void validateBattery ()
    {

    }
}

package dji.sdk.products;

import dji.common.util.DJICommonCallbacks;
import dji.sdk.flightcontroller.DJIFlightController;
import dji.sdk.mobilerc.DJIMobileRemoteController;
import dji.sdk.remotecontroller.DJIRemoteController;

/**
 *
 *
 * This class contains the components of an aircraft.
 */
public class DJIAircraft
{
    private String _name;

    /**
     * Returns aircraft name
     * @param callback
     */
    public void getAircraftName(DJICommonCallbacks.DJICompletionCallbackWith<String> callback)
    {

    }

    /**
     * Returns an instance of the aircraft's flight controller.
     * @return
     */
    public DJIFlightController getFlightController()
    {
        return null;
    }

    /**
     * Returns an instance of the aircraft's mobile remote controller
     * @return
     */
    public DJIMobileRemoteController getMobileRemoteController()
    {
        return null;
    }

    /**
     * Returns an instance of the aircraft's remote controller.
     * @return
     */
    public DJIRemoteController getRemoteController()
    {
        return null;
    }

    /**
     * Sets the aircraft's name.
     * @param name
     * @param callback
     */
    public void setAircraftName(String name, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }
}

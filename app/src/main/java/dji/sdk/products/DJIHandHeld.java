package dji.sdk.products;

import dji.common.util.DJICommonCallbacks;
import dji.sdk.handheldcontroller.DJIHandheldController;

/**
 *
 *
 * This class contains the components of a handheld device.
 */

public class DJIHandHeld
{
    public DJIHandHeld ()
    {

    }

    /**
     * Returns an instance of the handheldController.
     * @return
     */
    public DJIHandheldController getHandHeldController ()
    {
        return null;
    }

    /**
     * Returns the handheld device's name. Only supported by Osmo Mobile.
     * @param callback      The execution callback with the returned value(s).
     */
    public void getHandheldName (DJICommonCallbacks.DJICompletionCallbackWith<String> callback)
    {

    }

    /**
     * Sets the handheld device's name (also the Bluetooth name). The name cannot be more than 20 characters. It is only supported by Osmo Mobile.
     * @param name      Name to be set to the device.
     * @param callback  The execution callback with the returned execution result.
     */
    public void setHandheldName (String name, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }
}

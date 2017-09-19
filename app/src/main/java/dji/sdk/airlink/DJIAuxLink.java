package dji.sdk.airlink;

import java.util.ArrayList;

import dji.common.airlink.DJISignalInformation;

/**
 *
 *
 * Phantom 3 Standard and 4K products have two wireless links between the remote controller and aircraft.
 * A WiFi link for video, telemetry and app data, and an uplink control link for remote controller button/stick commands.
 * This control link is called the auxiliary control link to distinguish it from other products with only a WiFi link (like Osmo).
 */

public class DJIAuxLink
{
    /**
     * Callback method to receive updated signal information for wireless Auxiliary Control Link
     * between remote controller and aircraft. The Phantom 3 Standard and Phantom 3 4K both have
     * Auxiliary control links in addition to the WiFi link.
     */
    public interface DJIAuxLinkUpdatedRemoteControllerSignalInformationCallback
    {
        /**
         * When the remote controller (ground station) signal updates, the implementation of the callback is invoked.
         * @param antennas  DJISignalInformation object. The power property of DJISignalInformation is not used for DJIAuxLink and should be ignored.
         */
        public abstract void onResult (ArrayList<DJISignalInformation> antennas);
    }

    public DJIAuxLink()
    {

    }

    /**
     * Sets up a callback to listen for the update status of the ground antenna signal.
     * @param callback  The DJIAuxLinkUpdatedRemoteControllerSignalInformationCallback object.
     */
    public void setAuxLinkUpdatedRemoteControllerSignalInformationCallback (DJIAuxLink.DJIAuxLinkUpdatedRemoteControllerSignalInformationCallback callback)
    {

    }
}


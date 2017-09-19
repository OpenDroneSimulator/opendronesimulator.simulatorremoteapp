package dji.sdk.airlink;

import dji.common.airlink.DJIWiFiSignalQuality;
import dji.common.airlink.WifiChannelInterference;

/**
 *
 */

public class DJIWiFiLink
{
    /**
     * This is a delegate callback for detecting WiFi signal changes and values.
     */
    public interface DJIWiFiGetSignalChangedCallback
    {
        /**
         * Invoked with the execution result when the asynchronous call completes. Override to handle in your own code.
         * @param signal    The WiFi signal
         */
        public abstract void onResult (int signal);
    }

    public interface DJIWiFiSignalQualityChangedCallback
    {
        /**
         * Invoked with execution result when the asynchronous call completes. Please override to handle in your own code.
         * @param quality   the WiFi signal quality
         */
        public abstract void onResult (DJIWiFiSignalQuality quality);
    }

    /**
     * Callback to listen to any changes in all RSSIs
     */
    public interface RSSICallback
    {
        /**
         * This will be invoked when there is a change in RSSI
         * @param rssis an array of all the current RSSIs
         */
        public abstract void onChange (WifiChannelInterference[] rssis);
    }
}

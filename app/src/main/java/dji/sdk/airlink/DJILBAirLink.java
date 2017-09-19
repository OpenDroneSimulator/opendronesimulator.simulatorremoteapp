package dji.sdk.airlink;

import java.util.ArrayList;

import dji.common.LBAirLinkEncodeMode;
import dji.common.LBAirLinkSecondaryVideoFormat;
import dji.common.airlink.ChannelInterference;
import dji.common.airlink.ChannelSelectionMode;
import dji.common.airlink.DJISignalInformation;
import dji.common.airlink.FrequencyBandChannelRange;
import dji.common.airlink.LBAirLinkDataRate;
import dji.common.airlink.LBAirLinkFPVVideoQualityLatency;
import dji.common.airlink.LBAirLinkFrequencyBand;
import dji.common.airlink.LBAirLinkUnit;
import dji.common.util.DJICommonCallbacks;

/**
 *
 *
 * This class contains methods to change the settings of the Lightbridge Air Link.
 */

public abstract class DJILBAirLink
{
    /**
     * Callback for when the FPV video bandwidth percentage has changed. Each Remote Controller
     * can create a secondary video from the FPV and HD Gimbal video downlink information.
     * For the slave Remote Controllers it is important to know if the percentage bandwidth has
     * changed so the right PIP display mode (DJIPIPDisplayMode) can be selected. For example,
     * if the FPV video bandwidth goes to 100%, then DJIALPIPModeLB should be used.
     */
    public interface DJILBAirLinkFPVBandwidthPercentChangedCallback
    {
        /**
         * When the percentage bandwidth updates, the implementation of the callback is invoked.
         * @param bandwidthPercent      The FPV video bandwidth percentage.
         */
        public abstract void onResult (float bandwidthPercent);
    }

    /**
     * Callback of signal strength of all signals present on all available downlink channels.
     * Signals that are not the communication signal are considered interference.
     */
    public interface DJILBAirLinkUpdatedAllChannelInterferenceCallback
    {
        /**
         * Signal strength of all signals present on all available downlink channels.
         * Signals that are not the communication signal are considered interference.
         * @param channelInterferences  	The updated interference information.
         *                                  The elements in the array of `DJILBAirLinkChannelInterference`
         *                                  objects each hold the interference signal strength of a channel.
         *                                  Elements are sorted by increasing channel number.
         */
        public abstract void onResult (ChannelInterference[] channelInterferences);

    }

    /**
     * Signal quality and strength information for the current downlink channel on each air link module antenna.
     */
    public interface DJILBAirLinkUpdatedLightbridgeModuleSignalInformationCallback
    {
        /**
         * When the on-board antenna signal updates, the implementation of the callback is invoked.
         * @param antennas  Antenna signals for the antenna on the on-board side.
         */
        public abstract void onResult (ArrayList<DJISignalInformation> antennas);
    }

    /**
     * When the remote controller (or groundstation) uplink signal updates, the implementation of the callback is invoked.
     */
    public interface DJILBAirLinkUpdatedRemoteControllerSignalInformationCallback
    {
        /**
         *
         * Signal information for each antenna on the ground station side of the Lightbridge Link. The power property is valid only when the connecting product is Lightbridge 2. For other products, the value of power is always 0.
         * @param antennas  Signal information for each antenna on the ground station side of the Lightbridge Link. The power property is valid only when the connecting product is Lightbridge 2. For other products, the value of power is always 0.
         */
        public abstract void onResult (ArrayList<DJISignalInformation> antennas);
    }

    /**
     * Callback for when updated video data is received.
     */
    public interface DJIOnReceivedVideoCallback
    {
        /**
         *
         * @param videoBuffer   The received video data.
         * @param size          The size of the video data.
         */
        public abstract void onResult (byte[] videoBuffer, int size);
    }

    public DJILBAirLink()
    {

    }

    /**
     * Gets current downlink channel of air link.
     * @param callback  The execution callback with the value(s) returned.
     */
    public void getChannel (DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback)
    {

    }

    public void getChannelSelectionMode (DJICommonCallbacks.DJICompletionCallbackWith<ChannelSelectionMode> callback)
    {

    }

    public void getDataRate (DJICommonCallbacks.DJICompletionCallbackWith<LBAirLinkDataRate> callback)
    {

    }

    public void getDisplayOSDEnabled (DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {

    }

    public void getDualEncodeModePercentage (DJICommonCallbacks.DJICompletionCallbackWith<Float> callback)
    {

    }

    public void getEncodeMode (DJICommonCallbacks.DJICompletionCallbackWith<LBAirLinkEncodeMode> callback)
    {

    }

    public void getFPVQualityLatency (DJICommonCallbacks.DJICompletionCallbackWith<LBAirLinkFPVVideoQualityLatency> callback)
    {

    }

    public void getFPVVideoBandwidthPercent (DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback)
    {

    }

    public void getFrequencyBand (DJICommonCallbacks.DJICompletionCallbackWith<LBAirLinkFrequencyBand> callback)
    {

    }

    public void getFrequencyBandChannelRange (DJICommonCallbacks.DJICompletionCallbackWith<FrequencyBandChannelRange> callback)
    {

    }

    public void getHDMIOutputFormat (DJICommonCallbacks.DJICompletionCallbackWith<LBAirLinkSecondaryVideoFormat> callback)
    {

    }

    public void getOSDBottomMargin (DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback)
    {

    }

    public void getOSDLeftMargin (DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback)
    {

    }

    public void getOSDRightMargin (DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback)
    {

    }

    public void getOSDTopMargin (DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback)
    {

    }

    public void getOSDUnit (DJICommonCallbacks.DJICompletionCallbackWith<LBAirLinkUnit> callback)
    {

    }
}

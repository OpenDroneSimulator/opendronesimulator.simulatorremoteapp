package dji.sdk.airlink;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import dji.common.airlink.ChannelSelectionMode;
import dji.common.airlink.FrequencyInterference;
import dji.common.airlink.OcuSyncBandwidth;
import dji.common.airlink.OcuSyncWarningMessage;
import dji.common.airlink.SignalQualityUpdatedCallback;
import dji.common.util.DJICommonCallbacks;

/**
 *
 */

public class DJIOcuSyncLink
{
    public static final Set<OcuSyncWarningMessage> WARNING_MESSAGE_WHITE_LIST =  new Set<OcuSyncWarningMessage>()
    {
        @Override
        public int size()
        {
            return 0;
        }

        @Override
        public boolean isEmpty()
        {
            return false;
        }

        @Override
        public boolean contains(Object o)
        {
            return false;
        }

        @NonNull
        @Override
        public Iterator<OcuSyncWarningMessage> iterator()
        {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray()
        {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(T[] a)
        {
            return null;
        }

        @Override
        public boolean add(OcuSyncWarningMessage ocuSyncWarningMessage)
        {
            return false;
        }

        @Override
        public boolean remove(Object o)
        {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c)
        {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends OcuSyncWarningMessage> c)
        {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c)
        {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c)
        {
            return false;
        }

        @Override
        public void clear()
        {

        }
    };

    interface FrequencyInterferenceUpdatedCallback
    {
        /**
         * This will be invoked when there is a change in FrequencyInterference
         * @param rssis The updated interference information. The elements in the array of `FrequencyInterference` objects each hold interference information about a small part of the frequency band. Elements are sorted by increasing frequency. FrequencyInterference
         */
        abstract void onChange(FrequencyInterference[] rssis);
    }

    /**
     * Updated OcuSync link warning messages. This delegate method is called only when there are new warning messages on the OcuSync link (either uplink or downlink). If the array has no elements, then all previous warning messages are no longer in effect.
     */
    interface ReceivedWarningMessageCallback
    {
        /**
         * This will be invoked when there is a new Warning Message
         * @param messages  the array of OcuSyncWarningMessage representation of the current Warning Messages
         */
        abstract void	onUpdate(OcuSyncWarningMessage[] messages);
    }

    /**
     * Updated data rate in Mbps for the wireless downlink (from aircraft to remote controller). This link transfers all information from aircraft to remote controller, which is predominantly video information.
     */
    interface VideoDataRateUpdatedCallback
    {
        /**
         * This will be invoked when there is a new video data rate.
         * @param newValue  The data rate of the downlink in Mbps.
         */
        abstract void	onChange(Float newValue);
    }

    /**
     * Gets the channel bandwidth of the OcuSync link.
     * @param callback
     */
    public void getChannelBandwidth(DJICommonCallbacks.DJICompletionCallbackWith<OcuSyncBandwidth> callback)
    {

    }

    /**
     * Gets the selected channel number.
     * @param callback
     */
    public void getChannelNumber(DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback)
    {

    }

    /**
     * Getter for all channel numbers that are valid
     * @param callback
     */
    public void	getChannelNumberValidRange(DJICommonCallbacks.DJICompletionCallbackWith<Integer[]> callback)
    {

    }

    /**
     * Gets the channel selection mode.
     * @param callback
     */
    public void	getChannelSelectionMode(DJICommonCallbacks.DJICompletionCallbackWith<ChannelSelectionMode> callback)
    {

    }

    /**
     * Sets the channel bandwidth of the OcuSync link.
     * @param bandwidth
     * @param callback
     */
    public void setChannelBandwidth(OcuSyncBandwidth bandwidth, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Selects the channel by an index.
     * @param midPointIndex
     * @param callback
     */
    public void	setChannelNumber(Integer midPointIndex, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Sets the channel selection mode.
     * @param mode
     * @param callback
     */
    public void	setChannelSelectionMode(ChannelSelectionMode mode, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Sets the callback of SignalQualityUpdatedCallback.
     * @param callback
     */
    public synchronized void	setDownlinkSignalQualityUpdatedCallback(SignalQualityUpdatedCallback callback)
    {

    }

    /**
     * Sets the FrequencyInterferenceUpdatedCallback.
     * @param frequencyInterferenceUpdatedCallback
     */
    public synchronized void	setFrequencyInterferenceUpdatedCallback(DJIOcuSyncLink.FrequencyInterferenceUpdatedCallback frequencyInterferenceUpdatedCallback)
    {

    }

    /**
     * Sets the callback for ReceivedWarningMessageCallback.
     * @param receivedWarningMessageCallback
     */
    public synchronized void	setReceivedWarningMessageCallback(DJIOcuSyncLink.ReceivedWarningMessageCallback receivedWarningMessageCallback)
    {

    }

    /**
     * Updated signal quality in percent for the wireless uplink (from remote controller to aircraft).
     * @param callback
     */
    public synchronized void	setUplinkSignalQualityUpdatedCallback(SignalQualityUpdatedCallback callback)
    {

    }

    /**
     * Sets the callback for VideoDataRateUpdatedCallback.
     * @param videoDataRateUpdatedCallback
     */
    public synchronized void	setVideoDataRateUpdatedCallback(DJIOcuSyncLink.VideoDataRateUpdatedCallback videoDataRateUpdatedCallback)
    {

    }
}

package dji.sdk.base;

import dji.common.error.DJIError;
import dji.common.util.DJICommonCallbacks;

/**
 *
 */

public class DJIBaseComponent
{

    /**
     * This callback is used by the playback feature to acknowledge developers: the command has been sent.
     */
    public interface DJICommandSentAckCallback
    {
        /**
         * Invoked with the execution result when the asynchronous call completes.
         * Override to handle in your own code. If the asynchronous call completes successfully, it will return null.
         * @param error
         */
        public abstract void onResult (DJIError error);
    }

    /**
     * Receives notifications of component connectivity changes.
     */
    public interface DJIComponentListener
    {
        /**
         * Called when the connectivity status changes for the component. The callback will be called
         * when the the component disconnects from the product.
         * If the product itself gets disconnected, all of the product components' onComponentConnectivityChanged will be called.
         * @param isConnected
         */
        public abstract void onComponentConnectivityChanged (boolean isConnected);
    }

    /**
     * Returns firmware version of the component.
     * @param callback
     */
    public void getFirmwareVersion(DJICommonCallbacks.DJICompletionCallbackWith<String> callback)
    {

    }

    /**
     * Get the legacy serial number of the component. Note that this serial number does not match with the serial number found on the physical component.
     * @param callback  The execution callback with the value(s) returned.
     */
    public void getLegacySerialNumber (DJICommonCallbacks.DJICompletionCallbackWith<String> callback)
    {

    }

    /**
     * Get the serial number of the component. Note that this serial number does not match with the serial number found on the physical component.
     * @param callback  The execution callback with the value(s) returned.
     */
    public void getSerialNumber (DJICommonCallbacks.DJICompletionCallbackWith<String> callback)
    {

    }

    /**
     * This is the method for detecting whether the component is connected.
     * @return
     */
    public boolean isConnected ()
    {
        return false;
    }

    /**
     * Sets the listener for the DJI component.
     * @param listener
     */
    public void setDJIComponentListener (DJIBaseComponent.DJIComponentListener listener)
    {

    }
}

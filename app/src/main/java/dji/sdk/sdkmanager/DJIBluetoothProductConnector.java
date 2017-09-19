package dji.sdk.sdkmanager;

import java.util.ArrayList;

import dji.common.util.DJICommonCallbacks;

/**
 *
 *
 * This class contains methods to find DJI products around the mobile device that can be connected using Bluetooth and connect product with SDK.
 */

public class DJIBluetoothProductConnector
{
    /**
     * Delegate that receives the product list found by the connector.
     */
    public interface BluetoothProductConnectorListener
    {
        /**
         * Tells the delegate that the connector found DJI products that can be connected using the bluetooth connector.
         * Delegate will keep receiving the list after searchBluetoothProducts is called and it will stop after the searching is finished.
         * @param devices   A list of DJI products that found by the connector.
         */
        public abstract void onBluetoothDevicesListChanged (ArrayList<DJIBluetoothDevice> devices);
    }

    public DJIBluetoothProductConnector ()
    {

    }

    /**
     * Connects to the DJI product using Bluetooth. Once it is connected, user can `DJISDKManager` to get access to the product.
     * @param device        The bluetooth product to be connected with.
     * @param callback      The completion block returns the command execution result.
     */
    public void connect (DJIBluetoothDevice device, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    public void destroy ()
    {

    }

    /**
     * Disconnects current connected bluetooth product.
     * @param callback  The completion block returns the command execution result.
     */
    public void disconnect (DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    public static DJIBluetoothProductConnector getInstance ()
    {
        return null;
    }

    /**
     * Start searching the DJI Products around the mobile device that can be connected with SDK using Bluetooth.
     * Use #onBluetoothDevicesListChanged(ArrayList) onBluetoothDevicesListChanged method to receive the product list.
     * @param callback      Completion block returns the command execution result. It is called once the searching is started.
     */
    public void searchBluetoothProducts (DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    public void setBluetoothProductConnectorListener (DJIBluetoothProductConnector.BluetoothProductConnectorListener listener)
    {

    }
}

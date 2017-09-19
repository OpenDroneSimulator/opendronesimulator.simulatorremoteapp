package dji.sdk.sdkmanager;

/**
 *
 */

public class DJIBluetoothDevice
{
    public enum DJIBluetoothDeviceStatus
    {
        CONNECTED, CONNECTING, DISCONNECTED;
    }

    public DJIBluetoothDevice ()
    {

    }

    public boolean equals (Object o)
    {
        return false;
    }

    /**
     * Returns the name of the bluetooth device.
     * @return  a String representing the name.
     */
    public String getName ()
    {
        return "";
    }

    public int getRssi ()
    {
        return 0;
    }

    /**
     * Returns connection status for the bluetooth device.
     * @return  enum of DJIBluetoothDeviceStatus.
     */
    public DJIBluetoothDevice.DJIBluetoothDeviceStatus getStatus ()
    {
        return null;
    }

    public int hashCode ()
    {
        return 0;
    }

    public String toString ()
    {
        return "";
    }
}

package dji.sdk.base;

import java.util.ArrayList;

import dji.common.error.DJICameraError;
import dji.common.product.Model;
import dji.sdk.airlink.DJIAirLink;
import dji.sdk.battery.DJIBattery;
import dji.sdk.camera.DJICamera;
import dji.sdk.gimbal.DJIGimbal;
import dji.sdk.missionmanager.DJIMissionManager;

/**
 *
 */

public class DJIBaseProduct
{
    DJIBaseProductListener _listener;
    DJIDiagnostics.UpdateDiagnosticsListCallback _callback;

    /**
     * Receives notifications of component and product connectivity changes.
     */
    public interface DJIBaseProductListener
    {
        /**
         * Called when a component object changes.
         * @param key
         * @param oldComponent
         * @param newComponent
         */
        public abstract void onComponentChange (DJIBaseProduct.DJIComponentKey key, DJIBaseComponent oldComponent, DJIBaseComponent newComponent);

        /**
         * Called when connectivity status changes for the base product.
         * @param isConnected
         */
        public abstract void onProductConnectivityChanged (boolean isConnected);
    }

    /**
     * Callback interface for product version change.
     */
    public interface DJIVersionCallback
    {
        /**
         * Called when product version changes.
         * @param oldVersion
         * @param newVersion
         */
        public abstract void onProductVersionChange(String oldVersion, String newVersion);

    }

    /**
     * Specifies all the components.
     */
    public enum DJIComponentKey
    {
        AirLink, Battery, Camera, FlightController, Gimbal, HandHeldController, MOBILE_REMOTE_CONTROLLER, RemoteController;
    }

    /**
     * Specifies all the components.
     */
    public enum DJIComponentGroupKey
    {
        BatteryGroup;
    }

    public DJIBaseProduct()
    {

    }

    /**
     * Retrieves an instance of the aircraft's AirLink.
     * @return  An instance of the aircraft's AirLink.
     */
    public DJIAirLink getAirLink()
    {
        return null;
    }

    public ArrayList<DJIBattery> getBattiers()
    {
        return null;
    }

    /**
     * Returns an array of aircraft's batteries. It is used when the aircraft has multiple batteries, e.g. Matrice 600.
     * @return  An instance of the aircraft's smart battery.
     */
    public DJIBattery getBattery()
    {
        return null;
    }

    /**
     * Retrieves an instance of the aircraft's camera.
     * @return  An instance of the aircraft's camera.
     */
    public DJICamera getCamera()
    {
        return null;
    }

    /**
     * Get the product's firmware package version.
     * For Products except Phantom 4, Phantom 4 Pro, Mavic Pro and Inspire 2, Internet connection
     * is required and the execution time for this method highly depends on the Internet status.
     * @return
     */
    public String getFirmwarePackageVersion()
    {
        return "";
    }

    /**
     * Retrieves an instance of the aircraft's gimbal.
     * @return  An instance of the aircraft's gimbal.
     */
    public DJIGimbal getGimbal()
    {
        return null;
    }

    /**
     * Retrieves an instance of the aircraft's mission manager.
     * @return  An instance of the aircraft's mission manager.
     */
    public DJIMissionManager getMissionManager()
    {
        return null;
    }

    /**
     * Retrieves the model of the product.
     * @return
     */
    public Model getModel()
    {
        return null;
    }

    /**
     * true if the device is connected.
     * @return
     */
    public boolean isConnected()
    {
        return true;
    }

    public void onVersionChange(String oldVersion, String newVersion)
    {

    }

    /**
     * Sets the listener for the DJI base product.
     * @param listener
     */
    public void setDJIBaseProductListener(DJIBaseProduct.DJIBaseProductListener listener)
    {
        _listener = listener;
    }

    /**
     * Sets the callback for the DJI version.
     * @param callback
     */
    public void setDJIVersionCallback(DJIBaseProduct.DJIVersionCallback callback)
    {

    }

    /**
     * Sets up the diagnostics list update callback
     * @param callback
     */
    public void setUpdateDiagnosticsListCallback(DJIDiagnostics.UpdateDiagnosticsListCallback callback)
    {
        _callback = callback;
    }

    /**
     * Retrieves a String corresponding to the platform type.
     * @return
     */
    public String toString()
    {
        return "";
    }
}

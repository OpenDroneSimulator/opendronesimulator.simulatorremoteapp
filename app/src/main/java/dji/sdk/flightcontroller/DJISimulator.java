package dji.sdk.flightcontroller;

import dji.common.flightcontroller.DJISimulatorInitializationData;
import dji.common.util.DJICommonCallbacks;

/**
 *
 */

public class DJISimulator
{
    public interface UpdatedSimulatorStateDataCallback
    {

    }

    public void destroy()
    {

    }

    /**
     * true if the simulator has already enabled geo feature.
     * @param callback
     */
    public void getGeoFeatureInSimulatorEnabled (DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {

    }


    /**
     * true if the simulator has already started.
     * @return
     */
    public boolean hasSimulatorStarted()
    {
        return false;
    }

    /**
     * By default, there is no restriction in the simulator even though the aircraft is under a
     * restriction zone as well as a authorized zone. Set true to enable simulator to provide geo restriction.
     * @param enabled
     * @param callback
     */
    public void setGeoFeatureInSimulatorEnabled(boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Sets the callback function that updates the state data received from an aircraft in simulation mode.
     * @param callback  The execution callback with the execution result returned.
     */
    public void setUpdatedSimulatorStateDataCallback(DJISimulator.UpdatedSimulatorStateDataCallback callback)
    {

    }

    /**
     * Start simulator. Will result in error if simulation is already started.
     * @param data      	The data to initialize the simulator with.
     * @param callback      The execution callback with the execution result returned.
     */
    public void startSimulator(DJISimulatorInitializationData data, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Stop the simulator.
     * @param callback
     */
    public void stopSimulator(DJICommonCallbacks.DJICompletionCallback callback)
    {

    }
}

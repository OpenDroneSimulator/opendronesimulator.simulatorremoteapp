package dji.sdk.flightcontroller;

import dji.common.flightcontroller.DJIFlightControllerCurrentState;
import dji.common.flightcontroller.DJIIMUState;

/**
 *
 *
 *
 */

public class DJIFlightControllerDelegate
{
    /**
     * Callback interface that is used to receive IMU state from flight controller.
     */
    public interface FlightControllerIMUStateChangedCallback
    {
        public abstract void onStateChanged(DJIIMUState state);
    }

    /**
     * Callback function that updates the data received from an external device (e.g.the onboard device).
     * It is only supported for the Matrice 100.
     */
    public interface FlightControllerReceivedDataFromExternalDeviceCallback
    {
        /**
         * Invoked with execution result when the asynchronous call completes. Override to handle in your own code.
         * @param data  Data received from an external device. The size of the data will not be larger than 100 bytes.
         */
        public abstract void onResult(byte[] data);
    }

    /**
     * Callback function that updates the flight controller's current state data.
     * This method gets called 10 times per second after startUpdatingFlightControllerCurrentState is called.
     */
    public interface FlightControllerUpdateSystemStateCallback
    {
        /**
         * Invoked with execution result when the asynchronous call completes. Override to handle in your own code.
         * @param state     Current state of the flight controller.
         */
        public abstract void onResult(DJIFlightControllerCurrentState state);
    }

    /**
     * Callback function that gets called when the flight controller pushes a no fly zone update.
     */
    public interface ReceivedNoFlyZoneFromFlightControllerCallback
    {
        // public abstract void onReceivingNoFlyZone(DJINoFlyZoneModel.DJINoFlyZoneState noFlyZone);
        public abstract void onReceivingNoFlyZone(); // unkorrekte Implementation, aber DJINoFlyZoneModel.DJINoFlyZoneState existiert nicht im SDK
    }
}

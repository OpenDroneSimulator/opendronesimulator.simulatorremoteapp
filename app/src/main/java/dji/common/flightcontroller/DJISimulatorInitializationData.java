package dji.common.flightcontroller;

/**
 *
 *
 * Data to initialize the simulator with
 */

public class DJISimulatorInitializationData
{
    /**
     * Initial latitude of the aircraft.
     */
    public double _latitude;
    /**
     * Initial longitude of the aircraft.
     */
    public double _longitude;
    /**
     * The initial number of GNSS satellites with range [0, 20]
     */
    public int _numOfSatellites;
    /**
     * Aircraft simulator state push frequency in Hz with range [2, 150]. A setting of 10 Hz will result in onSimulatorDataUpdated being called 10 times per second.
     */
    public int _simulationStateUpdateFrenquency;

    public  DJISimulatorInitializationData()
    {
        _latitude = 0;
        _longitude = 0;
        _numOfSatellites = 0;
        _simulationStateUpdateFrenquency = 0;
    }

    /**
     *
     * @param latitude                              Initial latitude.
     * @param longitude                             Initial longitude.
     * @param simulationStateUpdateFrequency    	Frequency of simulation state updates.
     * @param numOfSatellites                       The initial number of the GPS satellites.
     */
    public DJISimulatorInitializationData(double latitude, double longitude, int simulationStateUpdateFrequency, int numOfSatellites)
    {
        _latitude = latitude;
        _longitude = longitude;
        _simulationStateUpdateFrenquency = simulationStateUpdateFrequency;
        _numOfSatellites = numOfSatellites;
    }
}

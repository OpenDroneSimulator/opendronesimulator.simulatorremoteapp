package dji.common.flightcontroller;

/**
 *
 */

public class DJIRTKReceiverInfo
{
    boolean _isChannelAvailable;
    int _satelliteCount;

    public DJIRTKReceiverInfo()
    {

    }

    public DJIRTKReceiverInfo(boolean isChannelAvailable, int satelliteCount)
    {
        _satelliteCount = satelliteCount;
        _isChannelAvailable = isChannelAvailable;
    }

    public int getSatelliteCount()
    {
        return _satelliteCount;
    }

    /**
     * true if constellation is supported.
     * @return
     */
    public boolean isConstellationSupported()
    {
        return false;
    }
}

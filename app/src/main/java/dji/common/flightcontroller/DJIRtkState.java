package dji.common.flightcontroller;

import dji.common.error.DJIError;

/**
 *
 *
 * This class holds the state of the Real Time Kinematic system including position, positioning solution and receiver information.
 */
public class DJIRtkState
{

    DJIError _djiError;
    DJIRTKPositioningSolution _positioningSolution;
    DJIRTKReceiverInfo _mainGpsChannel;
    DJIRTKReceiverInfo _auxGpsChannel;
    DJIRTKReceiverInfo _bsGpsChannel;
    DJIRTKReceiverInfo _mainBeiDouChannel;
    DJIRTKReceiverInfo _auxBeiDouChannel;
    DJIRTKReceiverInfo _bsBeiDouChannel;
    DJIRTKReceiverInfo _mainGlonassChannel;
    DJIRTKReceiverInfo _auxGlonassChannel;
    DJIRTKReceiverInfo _bsGlonassChannel;
    DJILocationCoordinate2D _airSideLocation;
    float _airSideAltitude;
    DJILocationCoordinate2D _groundBsLocation;
    float _groundBsAltitude;
    float _direction;
    boolean _isDirectionValid;
    boolean _isRtkEnabled;

    public DJIRtkState()
    {

    }

    DJIRtkState(DJIError error, DJIRTKPositioningSolution positioningState, DJIRTKReceiverInfo mainGpsChannel,
                DJIRTKReceiverInfo auxGpsChannel, DJIRTKReceiverInfo bsGpsChannel, DJIRTKReceiverInfo mainBeiDouChannel,
                DJIRTKReceiverInfo auxBeiDouChannel, DJIRTKReceiverInfo bsBeiDouChannel, DJIRTKReceiverInfo mainGlonassChannel,
                DJIRTKReceiverInfo auxGlonassChannel, DJIRTKReceiverInfo bsGlonassChannel, DJILocationCoordinate2D airSideLocation,
                float airSideAltitude, DJILocationCoordinate2D groundBsLocation, float groundBsAltitude, float direction,
                boolean isDirectionValid, boolean isRtkEnabled)
    {
        _djiError = error;
        _positioningSolution = positioningState;
        _mainGpsChannel = mainGpsChannel;
        _auxGpsChannel = auxGpsChannel;
        _bsGpsChannel = bsGpsChannel;
        _mainBeiDouChannel = mainBeiDouChannel;
        _auxBeiDouChannel = auxBeiDouChannel;
        _bsBeiDouChannel = bsBeiDouChannel;
        _mainGlonassChannel = mainGlonassChannel;
        _auxGlonassChannel = auxGlonassChannel;
        _bsGlonassChannel = bsGlonassChannel;
        _airSideLocation = airSideLocation;
        _airSideAltitude = airSideAltitude;
        _groundBsLocation = groundBsLocation;
        _groundBsAltitude = groundBsAltitude;
        _direction = direction;
        _isDirectionValid = isDirectionValid;
        _isRtkEnabled = isRtkEnabled;
    }

    /**
     * Altitude of the base station above sea level in meters.
     * @return
     */
    public float getBaseStationAltitude()
    {
        return _groundBsAltitude;
    }

    /**
     * Location of the base station in coordinates in degrees.
     * @return
     */
    public DJILocationCoordinate2D getBaseStationLocation()
    {
        return _groundBsLocation;
    }

    /**
     * Base station receiver BeiDou info.
     * @return
     */
    public DJIRTKReceiverInfo getBaseStationReceiverBeiDouInfo()
    {
        return _bsBeiDouChannel;
    }

    /**
     * Base station receiver glonass info
     */
    public DJIRTKReceiverInfo getBaseStationReceiverGlonassInfo()
    {
        return _bsGlonassChannel;
    }

    /**
     * Base station receiver GPS info.
     * @return
     */
    public DJIRTKReceiverInfo getBaseStationReceiverGpsInfo()
    {
        return _bsGpsChannel;
    }

    /**
     * Direction defined by the vector formed from Antenna 2 to Antenna 1 on the mobile station.
     * @return
     */
    public float getDirection()
    {
        return _direction;
    }

    /**
     * RTK error.
     * @return
     */
    public DJIError getError()
    {
        return _djiError;
    }

    /**
     * Altitude of the mobile station's receiver 1 antenna relative to the base station location.
     * @return
     */
    public float getMobileStationAntenna1Altitude()
    {
        return _airSideAltitude;
    }

    /**
     * Location information of the mobile station's receiver 1 antenna.
     * @return
     */
    public DJILocationCoordinate2D getMobileStationAntenna1Location()
    {
        return _airSideLocation;
    }

    /**
     * Mobile station (aircraft) receiver 1 BeiDou info.
     * @return
     */
    public DJIRTKReceiverInfo getMobileStationReceiver1BeiDouInfo()
    {
        return null;
    }

    /**
     * Mobile station (aircraft) receiver 1 GLONSS info.
     * @return
     */
    public DJIRTKReceiverInfo getMobileStationReceiver1GlonassInfo()
    {
        return null;
    }

    /**
     * Mobile station (aircraft) receiver 1 GPS info.
     * @return
     */
    public DJIRTKReceiverInfo getMobileStationReceiver1GpsInfo()
    {
        return null;
    }

    /**
     * Mobile station (aircraft) receiver 2 BeiDou info.
     * @return
     */
    public DJIRTKReceiverInfo getMobileStationReceiver2BeiDouInfo()
    {
        return null;
    }

    /**
     * Mobile station (aircraft) receiver 2 GLONSS info.
     * @return
     */
    public DJIRTKReceiverInfo getMobileStationReceiver2GlonassInfo()
    {
        return null;
    }

    /**
     * Mobile station (aircraft) receiver 2 GPS info.
     * @return
     */
    public DJIRTKReceiverInfo getMobileStationReceiver2GpsInfo()
    {
        return null;
    }

    /**
     * The positioning solution informs the quality of the position.
     * @return
     */
    public DJIRTKPositioningSolution getPositioningSolution()
    {
        return _positioningSolution;
    }

    /**
     * true if direction value is valid.
     * @return
     */
    public boolean isDirectionValid()
    {
        return _isDirectionValid;
    }

    /**
     * Whether the RTK is enabled or not.
     * @return
     */
    public boolean isRtkEnabled()
    {
        return _isRtkEnabled;
    }
}

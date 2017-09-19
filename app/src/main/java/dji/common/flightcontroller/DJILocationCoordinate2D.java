package dji.common.flightcontroller;

/**
 *
 *
 * A class representing 2 dimensional location coordinate.
 */
public class DJILocationCoordinate2D
{
    private double _latitude;
    private double _longitude;


    /**
     * Constructor.
     * @param latitude  The latitude to be set.
     * @param longitude The longitude to be set.
     */
    public DJILocationCoordinate2D(double latitude, double longitude)
    {

    }

    /**
     * Constructor.
     */
    public DJILocationCoordinate2D()
    {

    }

    /**
     * Constructor.
     * @param a A 2D DJI location coordinate.
     */
    public DJILocationCoordinate2D(DJILocationCoordinate2D a)
    {

    }

    /**
     * Returns the latitude.
     * @return
     */
    public double getLatitude()
    {
        return _latitude;
    }

    /**
     * Returns the longitude.
     * @return
     */
    public double getLongitude ()
    {
        return _longitude;
    }

    /**
     * Sets the latitude
     * @param latitude  The latitude to be set.
     */
    public void setLatitude(double latitude)
    {
        _latitude = latitude;
    }

    /**
     * Sets the longitude
     * @param longitude The longitude to be set.
     */
    public void setLongitude (double longitude)
    {
        _longitude = longitude;
    }
}

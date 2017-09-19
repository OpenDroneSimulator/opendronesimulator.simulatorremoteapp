package dji.common.flightcontroller;

/**
 *
 *
 * This is a structure for presenting the location, latitude, longitude, altitude.
 */

public class DJILocationCoordinate3D
{
    /**
     *
     * @param pCoordinate2D An DJILocationCoordinate2D object.
     * @param pAltitude     Altitude value.
     */
    public 	DJILocationCoordinate3D(DJILocationCoordinate2D pCoordinate2D, float pAltitude)
    {

    }

    /**
     *
     * @param pLatitude     latitude value
     * @param pLongitude    longitude value
     * @param pAltitude     altitude value
     */
    public 	DJILocationCoordinate3D(double pLatitude, double pLongitude, float pAltitude)
    {

    }

    /**
     * Returns the relative altitude of the aircraft relative to take off location, measured by barometer, in meters.
     * @return
     */
    public float getAltitude()
    {
        return 0f;
    }

    /**
     * Returns DJILocationCoordinate2D object, which could be used as input parameter for flight controller's interfaces.
     * @return
     */
    public DJILocationCoordinate2D getCoordinate2D()
    {
        return null;
    }

    /**
     * Returns the latitude.
     * @return
     */
    public double getLatitude()
    {
        return 0;
    }

    /**
     * Returns the longitude.
     * @return
     */
    public double getLongitude()
    {
        return 0;
    }


}

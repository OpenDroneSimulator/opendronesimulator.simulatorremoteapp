package dji.common.flightcontroller;

/**
 * The geospatial information in GEO is categorized in one of the three ways which are Warning Zone,
 * Authorization Zone and Restricted Zone). This data structure class contains the geospatial information for the fly zone.
 */

public class DJIFlyZoneInformation
{
    public DJIFlyZoneInformation()
    {

    }

    /**
     * Returns the FlyZoneCategory of the fly zone.
     * @return
     */
    public FlyZoneCategory getCategory ()
    {
        return null;
    }

    /**
     * The timestamp of when the flight warning or flight restriction ends.
     * It is UTC time in format YYYY-MM-DD hh:mm:ss. When the time is not available from the server,
     * `DJIFlyZoneInformationInvalidTimestamp` will be returned.
     * @return
     */
    public String getEndTime ()
    {
        return "";
    }

    /**
     * Returns the fly zone's ID, which the identifier of each fly zone and is required during the unlock process.
     * @return
     */
    public int getFlyZoneId ()
    {
        return 0;
    }

    /**
     * Returns the FlyZoneType of the fly zone.
     * @return
     */
    public FlyZoneType getFlyZoneType ()
    {
        return null;
    }

    /**
     * Returns the latitude of the fly zone's center.
     * @return
     */
    public double getLatitude ()
    {
        return 0;
    }

    /**
     * Returns the longitude of the fly zone's center.
     * @return
     */
    public double getLongitude ()
    {
        return 0;
    }

    /**
     * Returns the name of the fly zone.
     * @return
     */
    public String getName ()
    {
        return "";
    }

    /**
     * The radius of the fly zone in meters. If the fly zone is a truncated cone, then this radius is the bottom of the cone.
     * @return
     */
    public double getRadius ()
    {
        return 0;
    }

    /**
     * Returns the FlyZoneShape of the fly zone.
     * @return
     */
    public FlyZoneShape getShape ()
    {
        return null;
    }

    /**
     * The timestamp of when the flight warning or flight restriction begins. This is used for temporary flight restrictions.
     * It is UTC time in format YYYY-MM-DD hh:mm:ss. When the time is not available from the server,
     * `DJIFlyZoneInformationInvalidTimestamp` will be returned.
     * @return
     */
    public String getStartTime ()
    {
        return "";
    }

    /**
     * The timestamp the unlocked zone expires. It is UTC time in format YYYY-MM-DD hh:mm:ss.
     * When the fly zone is locked, `DJIFlyZoneInformationInvalidTimestamp` will be returned.
     * @return
     */
    public String getUnlockEndTime ()
    {
        return "";
    }

    /**
     * The timestamp when the fly zone is unlocked.
     * It is UTC time in format YYYY-MM-DD hh:mm:ss.
     * When the fly zone is locked, `DJIFlyZoneInformationInvalidTimestamp` will be returned.
     * @return
     */
    public String getUnlockStartTime ()
    {
        return "";
    }

}

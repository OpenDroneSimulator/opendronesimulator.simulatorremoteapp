package dji.sdk.base;

import dji.common.error.DJIError;
import dji.other.Ccode;

/**
 *
 *
 * This class contains the error type for GEO feature.
 * Copyright 2016 DJI All right reserved.
 * Created on March 27, 2016 5:08:12 AM
 */

public class DJIGeoError
{
    public static final DJIGeoError ACCOUNT_NOT_LOG_IN = new DJIGeoError();
    public static final DJIGeoError ACCOUNT_NOT_LOG_IN_OR_NOT_AUTHORIZED = new DJIGeoError();
    public static final DJIGeoError COULD_NOT_CONNECT_TO_INTERNET_FOR_PULLING_DATA = new DJIGeoError();
    public static final DJIGeoError COULD_NOT_ENABLE_OR_DISABLE_GEO_SYSTEM_WHILE_AIRCRAFT_IS_IN_THE_SKY = new DJIGeoError();
    public static final DJIGeoError COULD_NOT_FIND_UNLOCKED_RECORD_IN_THE_SERVER = new DJIGeoError();
    public static final DJIGeoError FLIGHT_CONTROLLER_SERIAL_NUMBER_IS_NOT_READY = new DJIGeoError();
    public static final DJIGeoError INVALID_SIMULATED_LOCATION = new DJIGeoError();
    public static final DJIGeoError NO_DATA_IN_DATABASE = new DJIGeoError();

    private String _description;

    /**
     * Retrieves the specific DJIAirLinkError corresponding to the error code.
     * @param ccode
     * @return
     */
    public static DJIError getDJIError (Ccode ccode)
    {
        return null;
    }

    /**
     * Retrieves the description of the error code.
     * @return
     */
    public String getDescription ()
    {
        return _description;
    }

    /**
     * Sets the description for the error code.
     * @param desc
     */
    public void setDescription (String desc)
    {
        _description = desc;
    }
}

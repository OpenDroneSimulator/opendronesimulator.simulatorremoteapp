package dji.sdk.base;

import dji.common.error.DJIError;
import dji.other.Ccode;

/**
 *
 *
 * Defines all mission manager related errors.
 */

public class DJIMissionManagerError
{
    public static final DJIMissionManagerError COMMON_DISCONNECTED = new DJIMissionManagerError();

    /**
     * Unsupported feature error.
     Where possible:
     This error will be returned by the function for a special feature interface when the feature is not supported by the device.
     */
    public static final DJIMissionManagerError COMMON_UNSUPPORTED = new DJIMissionManagerError();

    /**
     * The aircraft's altitude is too high.
     */
    public static final DJIMissionManagerError MISSION_RESULT_AIRCRAFT_ALTITUDE_TOO_HIGH = new DJIMissionManagerError();

    /**
     * The aircraft's altitude is too low.
     */
    public static final DJIMissionManagerError MISSION_RESULT_AIRCRAFT_ALTITUDE_TOO_LOW = new DJIMissionManagerError();

    /**
     * The aircraft is going home.
     */
    public static final DJIMissionManagerError MISSION_RESULT_AIRCRAFT_GOINGHOME = new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_AIRCRAFT_IN_NOFLYZONE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_AIRCRAFT_LANDING= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_AIRCRAFT_NOT_IN_THE_AIR= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_AIRCRAFT_RUNNING_MISSION= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_AIRCRAFT_STARTING_MOTOR= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_AIRCRAFT_TAKINGOFF= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_ALTITUDE_TOO_HIGH= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_ALTITUDE_TOO_LOW= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_BEGAN= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_CANCELED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_CANNOT_BYPASS_OBSTACLE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_DISTANCE_FROM_MISSION_TARGET_TOO_LONG= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_FAILED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_FEATURE_POINT_CANNOT_MATCH= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_FOLLOWME_DISCONNECT_TIME_TOOLONG= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_FOLLOWME_DISTANCE_TOO_LARGE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_FOLLOWME_GIMBAL_PITCH_ERROR= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_GPS_NOT_READY= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_GPS_SIGNAL_WEAK= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_HIGH_PRIORITY_MISSION_EXECUTING= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_HOMEPOINT_DIRECTION_UNKNOWN= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_HOMEPOINT_LOCATION_INVALID= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_HOMEPOINT_NOT_PAUSED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_HOMEPOINT_NOT_RECORDED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_HOMEPOINT_PAUSED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_HOMEPOINT_VALUE_INVALID= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_IN_NOVICE_MODE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_IOC_TYPE_UNKNOWN= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_IOC_WORKING= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_IS_FLYING= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_KEY_LEVEL_LOW= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_LOW_BATTERY= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MC_MODE_ERROR= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_ACROSS_NOFLYZONE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_CONDITION_NOT_SATISFIED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_CONFLICT= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_ENTRYPOINT_INVALID= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_ESTIMATE_TIME_TOO_LONG= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_HEADING_MODE_INVALID= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_INFO_INVALID= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_NOT_EXIST= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_NOT_INIT= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_PARAM_INVALID= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_RADIUS_INVALID= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_RADIUS_OVERLIMITED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_RESUME_FAILED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MISSION_SPEED_TOO_LARGE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MODE_ERROR= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_MOTOR_NOT_START= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_NAVIGATION_IS_NOT_OPEN= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_NOT_AUTO_MODE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_NO_VIDEO_FEED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_POINTING_AIRCRAFT_NOT_IN_THE_AIR= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_RC_MODE_ERROR= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_REACH_ALTITUDE_LOWER_BOUND= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_REACH_FLIGHT_LIMITATION= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TAKEOFF= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TIMEOUT= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TOO_CLOSE_TO_HOMEPOINT= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_GIMBAL_PITCH_TOO_LOW= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_OBSTACLE_DETECTED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_PAUSED_BY_USER= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_RECT_TOO_LARGE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_RECT_TOO_SMALL= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_TARGET_LOST= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_TARGET_LOW_CONFIDENCE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_TARGET_NOT_ENOUGH_FEATURE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_TARGET_SHAKING= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_TARGET_TOO_CLOSE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_TARGET_TOO_FAR= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_TRACKING_TARGET_TOO_HIGH= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_UNKNOWN= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_UNSUPPORTED_NAVIGATION_FOR_THE_PRODUCT= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_UPLOAD_WAYPOINT_NUM_MAX_LIMIT= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_USER_STOPPED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_VIDEO_FRAMERATE_TOO_LOW= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_VISION_DATA_ABNORMAL= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_VISION_SENSOR_LOW_QUALITY= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_VISION_SENSOR_OVEREXPOSED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_VISION_SENSOR_UNDEREXPOSED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_VISION_SYSTEM_ERROR= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_VISION_SYSTEM_NEED_CALIBRATION= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_VISION_SYSTEM_NOT_AUTHORIZED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINTS_UPLOADING= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_ACTION_PARAM_INVALID= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_DAMPING_CHECK_FAILED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_DISTANCE_TOO_CLOSE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_DISTANCE_TOO_LONG= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_IDLE_VELOCITY_INVALID= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_INDEX_OVERRANGE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_INFO_INVALID= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_MISSION_INFO_NOT_UPLOADED= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_NOT_RUNNING= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_REQUEST_IS_RUNNING= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_TOTAL_TRACE_TOO_LONG= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_TRACE_TOO_LONG= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_UPLOADING= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WAYPOINT_UPLOAD_NOT_COMPLETE= new DJIMissionManagerError();

    public static final DJIMissionManagerError MISSION_RESULT_WRONG_CMD= new DJIMissionManagerError();

    /**
     * Returns the specific error in DJIMissionManagerError according to the error code.
     * @param ccode
     * @return
     */
    public static DJIError getDJIError (Ccode ccode)
    {
        return null;
    }

    /**
     * Returns the description of the error code.
     * @return
     */
    public String getDescription ()
    {
        return "";
    }

    /**
     * Sets the description for the error code.
     * @param desc
     */
    public void setDescription (String desc)
    {

    }
}
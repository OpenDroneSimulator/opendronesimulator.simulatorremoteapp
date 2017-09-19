package dji.common.error;

/**
 * Defines all flight controller errors.
 */

public class DJIFlightControllerError extends DJIError
{
    public static final DJIFlightControllerError AIRCRAFT_FLYING_ERROR = new DJIFlightControllerError();

    public static final DJIFlightControllerError FAIL_TO_ENTER_TRANSPORT_MODE_WHEN_MOTORS_ON = new DJIFlightControllerError();

    public static final DJIFlightControllerError FLIGHT_CONTROLLER_COULD_NOT_ENTER_TRANSPORT_MODE = new DJIFlightControllerError();

    public static final DJIFlightControllerError FLIGHT_CONTROLLER_GPS_IS_NOT_HIGH_ENOUGH = new DJIFlightControllerError();

    public static final DJIFlightControllerError FLIGHT_CONTROLLER_INTERNAL_ERROR_ABOUT_UNEXPECTED_NULL_OBJECT = new DJIFlightControllerError();

    public static final DJIFlightControllerError FLIGHT_CONTROLLER_INVALID_PARAMETER = new DJIFlightControllerError();

    public static final DJIFlightControllerError FLIGHT_CONTROLLER_OBJECT_EMPTY_OR_NOT_AVAILABLE = new DJIFlightControllerError();

    public static final DJIFlightControllerError FLIGHT_CONTROLLER_UNSUPPORT = new DJIFlightControllerError();

    public static final DJIFlightControllerError GOHOME_ALTITUDE_TOO_HIGH = new DJIFlightControllerError();

    public static final DJIFlightControllerError GOHOME_ALTITUDE_TOO_LOW = new DJIFlightControllerError();

    public static final DJIFlightControllerError HOMEPOINT_TOO_FAR = new DJIFlightControllerError();

    public static final DJIFlightControllerError IMU_CALIBRATION_ERROR_IN_THE_AIR_OR_MOTORS_ON = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_AIRCRAFT_GOINGHOME = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_AIRCRAFT_IN_NOFLYZONE = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_AIRCRAFT_LANDING = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_AIRCRAFT_NOT_IN_THE_AIR = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_AIRCRAFT_STARTING_MOTOR = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_AIRCRAFT_TAKINGOFF = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_ALTITUDE_TOO_HIGH = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_ALTITUDE_TOO_LOW = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_BEGAN = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_CANCELED = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_DISTANCE_FROM_MISSION_TARGET_TOO_LONG = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_FAILED = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_FOLLOWME_DISCONNECT_TIME_TOO_LONG = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_FOLLOWME_DISTANCE_TOO_LARGE = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_FOLLOWME_GIMBAL_PITCH_ERROR = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_GPS_NOT_READY = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_GPS_SIGNAL_WEAK = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_HIGH_PRIORITY_MISSION_EXECUTING = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_HOMEPOINT_DIRECTION_UNKNOWN = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_HOMEPOINT_LOCATION_INVALID = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_HOMEPOINT_NOT_PAUSED = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_HOMEPOINT_NOT_RECORDED = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_HOMEPOINT_PAUSED = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_HOMEPOINT_VALUE_INVALID = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_IN_NOVICE_MODE = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_IOC_TYPE_UNKNOWN = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_IOC_WORKING = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_IS_FLYING = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_KEY_LEVEL_LOW = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_LOW_BATTERY = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MC_MODE_ERROR = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_ACROSS_NOFLYZONE = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_CONDITION_NOT_SATISFIED = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_CONFLICT = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_ENTRYPOINT_INVALID = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_ESTIMATE_TIME_TOO_LONG = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_HEADING_MODE_INVALID = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_INFO_INVALID = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_NOT_EXIST = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_NOT_INIT = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_PARAM_INVALID = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_RADIUS_INVALID = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_RADIUS_OVERLIMITED = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_RESUME_FAILED = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MISSION_SPEED_TOO_LARGE = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MODE_ERROR = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_MOTOR_NOT_START = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_NAVIGATION_IS_NOT_OPEN = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_NOT_AUTO_MODE = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_RC_MODE_ERROR = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_TAKEOFF = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_TIMEOUT = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_TOO_CLOSE_TO_HOMEPOINT = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_UNKNOWN = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_UNSUPPORTED_NAVIGATION_FOR_THE_PRODUCT = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_UPLOAD_WAYPOINT_NUM_MAX_LIMIT = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINTS_UPLOADING = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_ACTION_PARAM_INVALID = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_DAMPING_CHECK_FAILED = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_DISTANCE_TOO_CLOSE = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_DISTANCE_TOO_LONG = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_IDLE_VELOCITY_INVALID = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_INDEX_OVERRANGE = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_INFO_INVALID = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_MISSION_INFO_NOT_UPLOADED = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_NOT_RUNNING = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_REQUEST_IS_RUNNING = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_TOTAL_TRACE_TOO_LONG = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_TRACE_TOO_LONG = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_UPLOADING = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WAYPOINT_UPLOAD_NOT_COMPLETE = new DJIFlightControllerError();

    public static final DJIFlightControllerError MISSION_RESULT_WRONG_CMD = new DJIFlightControllerError();

    public static final DJIFlightControllerError RTK_BS_ANTENNA_ERROR = new DJIFlightControllerError();

    public static final DJIFlightControllerError RTK_BS_COORDINATE_RESETED = new DJIFlightControllerError();

    public static final DJIFlightControllerError RTK_CONNECTION_BROKEN = new DJIFlightControllerError();

    public static final DJIFlightControllerError RTK_START_ERROR = new DJIFlightControllerError();

    public static final DJIFlightControllerError UNABLE_TO_TAKE_OFF = new DJIFlightControllerError();


}

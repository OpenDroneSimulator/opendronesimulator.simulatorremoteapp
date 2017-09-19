package dji.common.error;

/**
 *
 *
 * Defines all camera-related errors.
 */

public class DJICameraError extends DJIError
{
    public static final DJICameraError CAMERASDCARDFULL = new DJICameraError();
    public static final DJICameraError CAMERA_CANNOT_SET_PARAMETERS_IN_THIS_STATE	 = new DJICameraError();
    public static final DJICameraError CAMERA_CONNECTION_NOT_OK = new DJICameraError();
    public static final DJICameraError CAMERA_COULD_NOT_DELETE_ALL_FILES = new DJICameraError();
    public static final DJICameraError CAMERA_EXEC_TIMEOUT = new DJICameraError();
    public static final DJICameraError CAMERA_GET_REMOTE_MEDIA_FAILED = new DJICameraError();
    public static final DJICameraError CAMERA_GET_THUMBNAIL_FAILED = new DJICameraError();
    public static final DJICameraError CAMERA_INVALID_PARAM = new DJICameraError();
    public static final DJICameraError CAMERA_NO_SDCARD = new DJICameraError();
    public static final DJICameraError CAMERA_PARAMETERS_GET_FAILED = new DJICameraError();
    public static final DJICameraError CAMERA_PARAMETERS_NOT_AVAILABLE = new DJICameraError();
    public static final DJICameraError CAMERA_PARAMETERS_SET_FAILED = new DJICameraError();
    public static final DJICameraError CAMERA_SDCARD_ERROR = new DJICameraError();
    public static final DJICameraError CAMERA_SENSOR_ERROR = new DJICameraError();
    public static final DJICameraError CAMERA_SYSTEM_ERROR = new DJICameraError();
    public static final DJICameraError CAMERA_UNSUPPORTED_CMD_STATE = new DJICameraError();
    public static final DJICameraError CHECK_PERMISSION_LEVEL1_IS_INVALID = new DJICameraError();
    public static final DJICameraError COMMON_CAMERA_UNKNOWN = new DJICameraError();
    public static final DJICameraError MEDIA_INVALID_REQUEST_TYPE = new DJICameraError();
    public static final DJICameraError MEDIA_NO_SUBMEDIA_FILES = new DJICameraError();
    public static final DJICameraError MEDIA_NO_SUCH_FILE = new DJICameraError();
    public static final DJICameraError MEDIA_REQUEST_CLIENT_ABORT = new DJICameraError();
    public static final DJICameraError MEDIA_REQUEST_DISCONNECT = new DJICameraError();
    public static final DJICameraError MEDIA_REQUEST_SERVER_ABORT = new DJICameraError();
}

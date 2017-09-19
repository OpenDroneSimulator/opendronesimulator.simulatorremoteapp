package dji.common.error;

/**
 *
 */

public class DJISDKError extends DJIError
{
    public static final DJISDKError APPLICATION_NOT_ACTIVATED = new DJISDKError();
    public static final DJISDKError COMMAND_EXECUTION_ERROR = new DJISDKError();
    public static final DJISDKError CONNECTION_TO_SDK_ERROR = new DJISDKError();
    public static final DJISDKError FEATURE_NOT_SUPPORTED = new DJISDKError();
    public static final DJISDKError GET_PARAMETERS_ERROR = new DJISDKError();
    public static final DJISDKError INVALID_PARAMETERS = new DJISDKError();
    public static final DJISDKError NOT_DEFINED = new DJISDKError();
    public static final DJISDKError REGISTRATION_AESENCRYPT_ERROR = new DJISDKError();
    public static final DJISDKError REGISTRATION_AESENCRYPT_FAILED = new DJISDKError();
    public static final DJISDKError REGISTRATION_APPKEY_INVALID_PLATFORM = new DJISDKError();
    public static final DJISDKError REGISTRATION_APPKEY_LEVEL_NOT_PERMITTED = new DJISDKError();
    public static final DJISDKError REGISTRATION_APPKEY_NOT_EXIST = new DJISDKError();
    public static final DJISDKError REGISTRATION_APPKEY_PROHIBITED = new DJISDKError();
    public static final DJISDKError REGISTRATION_BUNDLE_NOT_MATCH = new DJISDKError();
    public static final DJISDKError REGISTRATION_COULD_NOT_CONNECT_TO_INTERNET	 = new DJISDKError();
    public static final DJISDKError REGISTRATION_DEVICE_NOT_MATCH	 = new DJISDKError();
    public static final DJISDKError REGISTRATION_EMPTY_APPKEY = new DJISDKError();
    public static final DJISDKError REGISTRATION_HTTP_TIMEOUT = new DJISDKError();
    public static final DJISDKError REGISTRATION_INVALID_APPKEY = new DJISDKError();
    public static final DJISDKError REGISTRATION_INVALID_METADATA = new DJISDKError();
    public static final DJISDKError REGISTRATION_INVALID_UUID = new DJISDKError();
    public static final DJISDKError REGISTRATION_MAX_ACTIVATION_COUNT_REACHED = new DJISDKError();
    public static final DJISDKError REGISTRATION_SERVER_DATA_ABNORMAL = new DJISDKError();
    public static final DJISDKError REGISTRATION_SERVER_PARSE_FAILSE = new DJISDKError();
    public static final DJISDKError REGISTRATION_SERVER_WRITE_FAILS = new DJISDKError();
    public static final DJISDKError REGISTRATION_SUCCESS = new DJISDKError();
    public static final DJISDKError REGISTRATION_UNKNOWN_ERROR = new DJISDKError();
    public static final DJISDKError SEND_DATA_ERROR = new DJISDKError();
    public static final DJISDKError SET_PARAMETER_ERROR = new DJISDKError();
    public static final DJISDKError SYSTEM_BUSY = new DJISDKError();

    /**
     * Returns the description of the error code.
     * @return  the description of the error code.
     */
    public String getDescription()
    {
        return _description;
    }

    /**
     * Sets the description for the error code.
     * @param description   the description for the error code.
     */
    public void setDescription(String description)
    {
        _description = description;
    }
}

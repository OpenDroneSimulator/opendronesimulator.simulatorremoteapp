package dji.common.error;

/**
 *
 */

public class DJISDKCacheError extends DJIError
{
    public static final DJISDKCacheError DISCONNECTED = new DJISDKCacheError();
    public static final DJISDKCacheError INVALID_KEY_FORMAT = new DJISDKCacheError();
    public static final DJISDKCacheError INVALID_KEY_FOR_COMPONENT = new DJISDKCacheError();
    public static final DJISDKCacheError INVALID_VALUE = new DJISDKCacheError();
    public static final DJISDKCacheError INVALID_VALUE_TYPE = new DJISDKCacheError();
    public static final DJISDKCacheError KEY_UNSUPPORTED = new DJISDKCacheError();
    public static final DJISDKCacheError NO_ACTION_FOR_KEY = new DJISDKCacheError();
    public static final DJISDKCacheError NO_GET_FOR_KEY = new DJISDKCacheError();
    public static final DJISDKCacheError NO_SET_FOR_KEY = new DJISDKCacheError();
    public static final DJISDKCacheError NO_STORAGE_ACCESS = new DJISDKCacheError();
    public static final DJISDKCacheError UNKNOWN_ACCESS_TYPE = new DJISDKCacheError();

}

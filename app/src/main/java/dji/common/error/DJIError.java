package dji.common.error;

import dji.other.Ccode;

/**
 *
 */

public class DJIError
{
    public static final DJIError BATTERY_GET_SMART_BATTERY_INFO_FAILED = new DJIError();
    public static final DJIError BATTERY_PAIR_FAILED = new DJIError();
    public static final DJIError COMMAND_NOT_SUPPORTED_BY_FIRMWARE = new DJIError();
    public static final DJIError COMMON_DISCONNECTED = new DJIError();
    public static final DJIError COMMON_EXECEUTION_FAILED = new DJIError();
    public static final DJIError COMMON_PARAM_ILLEGAL = new DJIError();
    public static final DJIError COMMON_PARAM_INVALID = new DJIError();
    public static final DJIError COMMON_SYSTEM_BUSY = new DJIError();
    public static final DJIError COMMON_TIMEOUT = new DJIError();
    public static final DJIError COMMON_UNDEFINED = new DJIError();
    public static final DJIError COMMON_UNKNOWN = new DJIError();
    public static final DJIError COMMON_UNSUPPORTED = new DJIError();
    public static final DJIError FIRMWARE_CRC_WRONG = new DJIError();
    public static final DJIError FIRMWARE_LENGTH_WRONG = new DJIError();
    public static final DJIError FIMRWARE_MATCH_WRONG = new DJIError();
    public static final DJIError FIRMWARE_NON_SEQUENCE = new DJIError();
    public static final DJIError FLASH_CLEAR_WRONG = new DJIError();
    public static final DJIError FLASH_FLUSHING = new DJIError();
    public static final DJIError FLASH_WRITE_WRONG = new DJIError();
    public static final DJIError IMAGE_TRANSMITTER_INVALID_PARAMETER = new DJIError();
    public static final DJIError MEDIA_INVALID_REQUEST_TYPE = new DJIError();
    public static final DJIError MEDIA_NO_SUCH_FILE = new DJIError();
    public static final DJIError MEDIA_REQUEST_CLIENT_ABORT = new DJIError();
    public static final DJIError MEDIA_REQUEST_DISCONNECT = new DJIError();
    public static final DJIError MEDIA_REQUEST_SERVER_ABORT = new DJIError();
    public static final DJIError UNABLE_TO_GET_FIRMWARE_VERSION = new DJIError();
    public static final DJIError UNABLE_TO_GET_FLAGS = new DJIError();
    public static final DJIError UNABLE_TO_GET_FLAG_BUT_RETRY = new DJIError();
    public static final DJIError UPDATE_WRONG = new DJIError();

    String _description;

    public static DJIError getDJIError (Ccode ccode)
    {
        return null;
    }

    public String getDescription()
    {
        return _description;
    }

 //   public static DJIError getDjiError(DJIAlbumPullErrorType code)
   // {

    //}

    public void setDescription (String desc)
    {
        _description = desc;
    }

    public String toString()
    {
        return _description;
    }
}

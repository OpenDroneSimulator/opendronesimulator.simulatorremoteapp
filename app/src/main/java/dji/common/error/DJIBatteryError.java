package dji.common.error;

/**
 *
 *
 * Defines all battery related errors
 */

public class DJIBatteryError extends DJIError
{

    public static final DJIBatteryError BATTERY_GET_SMART_BATTERY_INFO_FAILED = new DJIBatteryError();

    public static final DJIBatteryError UPDATE_WRONG = new DJIBatteryError();

    public DJIBatteryError ()
    {

    }
}

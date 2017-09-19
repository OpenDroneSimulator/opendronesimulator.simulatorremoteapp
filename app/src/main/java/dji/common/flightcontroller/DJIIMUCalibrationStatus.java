package dji.common.flightcontroller;

/**
 *
 * Enum for IMU sensor status
 */
public enum DJIIMUCalibrationStatus
{
    Failed   , InProgress  , Initialization  , None , Succeed , Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIIMUCalibrationStatus find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

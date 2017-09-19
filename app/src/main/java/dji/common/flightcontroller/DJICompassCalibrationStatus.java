package dji.common.flightcontroller;

/**
 *
 */

public enum DJICompassCalibrationStatus
{
    Failed , Horizontal, Normal, Succeeded, Vertical;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJICompassCalibrationStatus find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

package dji.common.flightcontroller;

/**
 *
 * Enum for IMU sensor status
 */
public enum DJIIMUSensorState
{
    BiasLarge  , BiasMedium , BiasNormal , Calibrating, DataException,
    Disconnect, Failed, Motion, Unknown, WarmingUp;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIIMUSensorState find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

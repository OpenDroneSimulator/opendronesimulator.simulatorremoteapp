package dji.common.flightcontroller;

/**
 *
 */

public class DJIAttitude
{
    public double _pitch;
    public double _roll;
    public double _yaw;

    /**
     *
     * @param pitch Pitch value to be set.
     * @param roll  Roll value to be set.
     * @param yaw   Yaw value to be set.
     */
    public DJIAttitude(double pitch, double roll, double yaw)
    {
        _pitch = pitch;
        _roll = roll;
        _yaw = yaw;
    }

    public DJIAttitude()
    {

    }
}

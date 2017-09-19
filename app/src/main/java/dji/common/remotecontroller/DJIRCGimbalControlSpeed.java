package dji.common.remotecontroller;

/**
 *
 * DJI RC gimbal control speed
 */

public class DJIRCGimbalControlSpeed
{
    /**
     * Gimbal's pitch speed with range [0,100].
     */
    public short _pitchSpeed;
    /**
     * Gimbal's roll speed with range [0,100].
     */
    public short _rollSpeed;
    /**
     * Gimbal's yaw speed with range [0,100].
     */
    public short _yawSpeed;

    public 	DJIRCGimbalControlSpeed(short pitchSpeed, short rollSpeed, short yawSpeed)
    {
        _pitchSpeed = pitchSpeed;
        _rollSpeed = rollSpeed;
        _yawSpeed = yawSpeed;
    }
}

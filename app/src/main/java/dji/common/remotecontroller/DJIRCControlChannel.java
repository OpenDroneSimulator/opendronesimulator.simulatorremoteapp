package dji.common.remotecontroller;

/**
 *
 *
 * Remote controller's channel.
 */

public class DJIRCControlChannel
{
    /**
     * Name of the control channel. The default is American.
     */
    public DJIRCControlChannelName _channel;

    /**
     * The control channel's settings will be reversed.
     * For example, for throttle the joystick is moved up or down.
     * If the control channel was reversed,
     * the same motion that was once used for up would now move the aircraft
     * down and the same motion that was once used for down would now move the aircraft up.
     */
    public boolean _isReverse;

    public DJIRCControlChannel(DJIRCControlChannelName channel, boolean isReverse)
    {
        _channel = channel;
        _isReverse = isReverse;
    }

    public DJIRCControlChannel()
    {

    }
}

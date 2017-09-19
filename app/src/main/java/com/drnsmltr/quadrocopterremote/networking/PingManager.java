package com.drnsmltr.quadrocopterremote.networking;

/**
 *
 *
 * Overwatches the amount of commands which are sent to the unity application.
 * Every command should be checked by the PingManager before it gets sent
 */
public class PingManager
{
    private static final String TAG = PingManager.class.getSimpleName();

    private int _ping;
    private long _timeAtLastSentCmd;

    public PingManager(int ping)
    {
        setPing(ping);
        _timeAtLastSentCmd = System.currentTimeMillis();
    }


    /**
     * Checks if the time, which has been passed away since the last time a command has been sent,
     * is long enough
     * @param force if the force is true the command can be sent, even if the time passed isn't long enough.
     * @return  true if the command is permitted to be sent
     */
    public boolean isAllowedToBeSent(boolean force)
    {
        if(force || System.currentTimeMillis() - _timeAtLastSentCmd > _ping)
        {
            _timeAtLastSentCmd = System.currentTimeMillis();
            return true;
        }else
        {
            return false;
        }
    }

    public void setPing(int ping)
    {
        _ping = ping;
    }
}

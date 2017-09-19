package dji.common.airlink;

/**
 *
 * The interference power of a LBAirLink channel.
 */

public class ChannelInterference
{
    public ChannelInterference ()
    {

    }

    /**
     * The channel number. Different frequency bands have different channel index ranges.
     * @return
     */
    public int getChannel ()
    {
        return 0;
    }

    /**
     * The interference power with range from [-60, -100] dBm. A smaller, more negative value represents less interference and better communication quality.
     * @return
     */
    public int getPower ()
    {
        return 0;
    }
}

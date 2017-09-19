package dji.common.airlink;


public enum ChannelSelectionMode
{
    /**
     * Air link will automatically select the best physical channel based on the signal environment.
     */
    Auto ,
    /**
     * Manually select the physical channel.
     */
    Manual,

    /**
     * Unknown physical channel selection mode.
     */
    Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static ChannelSelectionMode find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

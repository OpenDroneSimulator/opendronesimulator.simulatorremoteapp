package dji.common.airlink;

/**
 *
 *
 * This class contains the signal status of a channel.
 *
 */

public class DJISignalInformation
{
    private int _percent, _energy;

    public 	DJISignalInformation(int percent, int energy)
    {
        _percent = percent;
        _energy = energy;
    }

    /**
     * Signal quality in percent [0, 100].
     * @return
     */
    public int getPercent ()
    {
        return _percent;
    }

    /**
     * Signal strength in dBm.
     * @return
     */
    public int getPower ()
    {
        return _energy;
    }
}

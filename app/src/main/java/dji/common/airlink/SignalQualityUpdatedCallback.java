package dji.common.airlink;

/**
 * Updated signal quality in percent for the wireless (from aircraft to remote controller).
 * This link transfers all information from aircraft to remote controller, which is predominantly video information.
 * Signal quality is a function of signal strength, interference and data rate.
 * Signal quality will be more susceptible to weak signal strengths or high interference when the data rate is high.
 */
public interface SignalQualityUpdatedCallback
{
    /**
     *
     * @param strength The signal quality in percent with range [0, 100], where 100 is the best quality.
     */
    void onChange(int strength);
}

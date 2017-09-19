package dji.sdk.flightcontroller;

import dji.common.util.DJICommonCallbacks;

/**
 *
 */

public class DJIFlightLimitation
{
    public DJIFlightLimitation()
    {

    }

    /**
     * Gets the maximum flight height limitation from the aircraft.
     * @param callback  The execution callback with the value(s) returned.
     */
    public void getMaxFlightHeight(DJICommonCallbacks.DJICompletionCallbackWith<Float> callback)
    {

    }

    /**
     * Gets the maximum flight radius limitation from the aircraft.
     * @param callback  The execution callback with the value(s) returned.
     */
    public void getMaxFlightRadius(DJICommonCallbacks.DJICompletionCallbackWith<Float> callback)
    {

    }

    /**
     * Gets whether the maximum flight radius limitation is enabled.
     * @param callback  The execution callback with the value(s) returned.
     */
    public void getMaxFlightRadiusLimitationEnable(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {

    }

    /**
     * Determines if the maximum flight height has been reached.
     * @return
     */
    public boolean hasReachedMaxFlightHeight()
    {
        return false;
    }

    /**
     *
     * @return  true if the aircraft has reached the maximum flight radius.
     */
    public boolean hasReachedMaxFlightRadius()
    {
        return false;
    }

    /**
     * Sets the maximum flight height limitation for aircraft. MaxHeight value should be in range [20, 500] m.
     * @param maxHeight Maximum height for the aircraft.
     * @param callback  The execution callback with the execution result returned.
     */
    public void setMaxFlightHeight(float maxHeight, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Sets the maximum flight radius limitation for the aircraft. The radius is calculated from the home point. maxRadius value should be in range [15, 500] m.
     * @param maxRadius Maximum flight radius for aircraft.
     * @param callback  The execution callback with the execution result returned.
     */
    public void setMaxFlightRadius(float maxRadius, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Sets whether the maximum flight radius limitation is enabled. If enable is false<.code>, there is no maximum flight radius limitation.
     * @param enabled   Maximum flight radius limitation is enabled.
     * @param callback  The execution callback with the execution result returned.
     */
    public void setMaxFlightRadiusLimitationEnabled(boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }
}

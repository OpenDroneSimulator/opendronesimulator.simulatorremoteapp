package dji.sdk.util;

/**
 * DJIParamCapabilityMinMax adds the maximum and minimum possible values of the parameter to the base class property of whether the parameter is supported by the component or product.
 */

public class DJIParamMinMaxCapability
{
    Number _min, _max;
    boolean _isSupported;

    public DJIParamMinMaxCapability (boolean isSuppported, Number min, Number max)
    {
        _isSupported = isSuppported;
        _min = min;
        _max = max;
    }

    /**
     * return the maximum possible value of the parameter.
     * @return
     */
    public Number getMax()
    {
        return _max;
    }

    /**
     * return the minimum possible value of the parameter.
     * @return
     */
    public Number getMin()
    {
        return _min;
    }
}

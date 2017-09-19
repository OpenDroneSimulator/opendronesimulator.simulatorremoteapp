package dji.common.util;

/**
 * Created by Yanneck on 17.02.2017.
 *
 * DJIParamCapabilityMinMax adds the maximum and minimum possible values of the parameter
 * to the base class property of whether the parameter is supported by the component or product.
 */

public class DJIParamMinMaxCapability
{
    private Number _min;
    private Number _max;

    public DJIParamMinMaxCapability (boolean isSuppported, Number min, Number max)
    {
        _min = min;
        _max = max;
    }

    public Number getMax ()
    {
        return _max;
    }

    public Number getMin ()
    {
        return _min;
    }
}

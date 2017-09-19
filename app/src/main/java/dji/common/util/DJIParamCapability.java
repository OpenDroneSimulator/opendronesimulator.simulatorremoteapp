package dji.common.util;

/**
 * Created by Yanneck on 17.02.2017.
 *
 * DJIParamCapability represents the capability of a parameter of a component or product.
 DJIParamCapability can be sub-classed to include additional information on the parameter.
 DJIParamCapabilityMinMax includes the maximum and minimum possible values of the parameter.
 */

public class DJIParamCapability
{
    private boolean _isSupported;

    public DJIParamCapability (boolean isSupported)
    {
        _isSupported = isSupported;
    }

    /**
     * return true if the component or product supports the parameter.
     * @return
     */
    public boolean isSuppported ()
    {
        return _isSupported;
    }
}

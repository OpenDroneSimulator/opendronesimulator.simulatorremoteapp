package dji.common;

/**
 *
 */

public class DJIFlightErrorInformation
{
    private DJIFlightError _error;

    public DJIFlightErrorInformation()
    {

    }

    public DJIFlightError getFlightError()
    {
        return _error;
    }

    boolean hasError()
    {
        if (_error.equals(null))
        {
            return true;
        }else
        {
            return false;
        }
    }
}

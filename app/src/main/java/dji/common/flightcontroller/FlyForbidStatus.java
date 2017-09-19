package dji.common.flightcontroller;

/**
 *
 * An enum class contains the fly forbid status.
 */

public enum FlyForbidStatus
{
    AlreadyInFlightForbidArea   , AlreadyInWarningArea  , ApproachingFlyForbidArea  , NoRestriction , Unknown ;

    public boolean _equals (int b)
    {
        return true;
    }

    public static FlyForbidStatus find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

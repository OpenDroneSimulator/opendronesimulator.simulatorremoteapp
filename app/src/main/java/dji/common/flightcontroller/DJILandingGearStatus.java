package dji.common.flightcontroller;

/**
 *
 */

public enum DJILandingGearStatus
{
    Deployed  , Deploying , Retracted , Retracting , Stopped , Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJILandingGearStatus find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

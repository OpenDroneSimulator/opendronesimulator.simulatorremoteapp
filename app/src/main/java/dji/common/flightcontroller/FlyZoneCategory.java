package dji.common.flightcontroller;

/**
 *
 * An enum class represents the category of fly zone.
 */

public enum FlyZoneCategory
{
    Authorization, EnhancedWarning, Restricted, Unknown, Warning;

    public boolean _equals (int b)
    {
        return true;
    }

    public static FlyZoneCategory find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

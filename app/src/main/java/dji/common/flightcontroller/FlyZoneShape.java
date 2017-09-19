package dji.common.flightcontroller;

/**
 *
 * An enum class contains the shape of the fly zone.
 */

public enum FlyZoneShape
{
    Cone, Cylinder, Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static FlyZoneShape find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

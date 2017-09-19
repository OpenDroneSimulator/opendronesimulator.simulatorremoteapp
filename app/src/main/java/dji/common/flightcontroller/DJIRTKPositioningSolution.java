package dji.common.flightcontroller;

/**
 *
 */

public enum DJIRTKPositioningSolution
{
    FixedPoint , Float , None , SinglePoint;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIRTKPositioningSolution find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

package dji.common.flightcontroller;

/**
 *
 */

public enum DJIGoHomeStatus
{
    AutoFlyToHomePoint  , Braking , Bypassing, Completion, Failed, GoDownToGround, GoUpToHeight,
    None, TurnDirectionToHomePoint;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIGoHomeStatus find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

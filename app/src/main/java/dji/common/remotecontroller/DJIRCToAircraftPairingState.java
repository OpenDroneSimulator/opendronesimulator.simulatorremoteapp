package dji.common.remotecontroller;

/**
 *
 */

public enum DJIRCToAircraftPairingState
{
    Completed, None, Pairing, Unknown;


    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIRCToAircraftPairingState find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

package dji.common.remotecontroller;

/**
 *
 */

public enum DJIRCJoinMasterResult
{
    Maximum, PasswordError, Rejected, ResponseTimeout, Successful, Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIRCJoinMasterResult find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

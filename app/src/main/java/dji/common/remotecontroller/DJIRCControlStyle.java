package dji.common.remotecontroller;

/**
 *
 */

public enum DJIRCControlStyle
{
    American, Chinese, Custom, Japanese, SlaveCustom, SlaveDefault, Unknown;


    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIRCControlStyle find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

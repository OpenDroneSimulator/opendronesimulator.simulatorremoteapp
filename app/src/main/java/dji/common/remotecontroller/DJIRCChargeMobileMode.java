package dji.common.remotecontroller;

/**
 *
 */

/**
 * Modes to charge the Android mobile device. Only supported by Inspire 2.
 */
public enum DJIRCChargeMobileMode
{
    Always, Intelligent, Never, Unknown;

    /**
     * Returns the boolean result which compare the input integer value with the real value of a enum constant.
     * @param b
     * @return
     */
    public boolean _equals(int b)
    {
        return true;
    }

    /**
     * Returns the enum constant of this type with the input integer value.
     * @param value
     * @return
     */
    public static DJIRCChargeMobileMode find(int value)
    {
        return null;
    }

    /**
     * Returns the real value of a enum constant.
     * @return
     */
    public int value()
    {
        return 0;
    }

}

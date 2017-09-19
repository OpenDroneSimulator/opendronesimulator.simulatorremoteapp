package dji.common.remotecontroller;

/**
 * Remote Controller's battery information.
 */
public class DJIRCBatteryInfo
{
    /**
     * The remaining power in the Remote Controller's battery in milliamp hours (mAh).
     */
    public int remainingEnergyInMAh;
    /**
     * The remaining power in the Remote Controller's battery as a percentage in the range of [0, 100].
     */
    public int remainingEnergyInPercent;

    /**
     * Constructor
     * @param remainingEnergyMAh        The remaining power in the Remote Controller's battery in milliamp hours (mAh).
     * @param remainingEnergyPercent    The remaining power in the Remote Controller's battery as a percentage in the range of [0, 100].
     */
    DJIRCBatteryInfo(int remainingEnergyMAh, int remainingEnergyPercent)
    {
        remainingEnergyMAh = remainingEnergyMAh;
        remainingEnergyPercent = remainingEnergyPercent;
    }

    DJIRCBatteryInfo()
    {

    }
}

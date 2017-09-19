package dji.sdk.battery;

import dji.common.battery.DJIBatteryPairStatus;
import dji.common.util.DJICommonCallbacks;

/**
 *
 */

public class DJIInspire2Battery
{
    public DJIInspire2Battery()
    {

    }

    /**
     * A battery's full charge capacity reduces a little every time it goes through a discharge and recharge cycle. Therefore, older batteries that have gone through many cycles will have lower full charge capacity than newer batteries. When multiple batteries are used simultaneously in a product, the aggregate full charge capacity will be limited by the battery with lowest full charge capacity. To optimize the amount of energy delivered by a battery over its lifetime to a product, batteries should be matched or paired with other batteries of similar full charge capacity. The operational challenges of always using paired batteries can be alleviated using the battery pairing interfaces. This method can then be used to determine if the installed battery combination is a previously assigned pair or not. Only supported by Inspire 2.
     * @param callback  Completion block that receives the getter execution result.
     */
    public void getBatteryPairStatus (DJICommonCallbacks.DJICompletionCallbackWith<DJIBatteryPairStatus> callback)
    {

    }

    public void setBatteryPairStatus (DJIBatteryPairStatus status, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Sets up the callback for updating the battery state.
     * @param callback
     */
    public void setBatteryStateUpdateCallback (DJIBattery.DJIBatteryStateUpdateCallback callback)
    {

    }
}

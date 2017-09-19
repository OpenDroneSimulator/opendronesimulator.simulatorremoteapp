package dji.sdk.battery;

import dji.common.battery.DJIBatteryAggregationState;
import dji.common.battery.DJIBatteryCell;
import dji.common.battery.DJIBatteryLowCellVoltageOperation;
import dji.common.battery.DJIBatteryPairStatus;
import dji.common.battery.DJIBatteryState;
import dji.common.battery.DJIBatteryWarningInformation;
import dji.common.util.DJICommonCallbacks;

/**
 *
 * This class manages the battery's information and real-time status of the connected product.
 */

public abstract class DJIBattery
{
    /**
     * This protocol provides a delegate method for you to update the battery's current state.
     */
    public interface DJIBatteryAggregationStateUpdatedCallback
    {
        /**
         * Returns the DJIBatteryGroupState.
         * @param batteryAggregationState   the updated battery group state.
         */
        public abstract void onResult (DJIBatteryAggregationState batteryAggregationState);
    }

    /**
     * This interface is for updating the battery state.
     */
    public interface DJIBatteryStateUpdateCallback
    {
        /**
         * Returns the DJIBatteryState.
         * @param state     the updated battery state.
         */
        public abstract void onResult (DJIBatteryState state);
    }

    public DJIBattery()
    {

    }

    public DJIBattery (int fullChargeEnergy, int currentEnergy, int currentVoltage,
                       int currentCurrent, int lifetimeRemainingPercent, int batteryEnergyRemainingPercent,
                       float batteryTemperature, int numberOfDischarge)
    {

    }

    /**
     * A battery's full charge capacity reduces a little every time it goes through a discharge and recharge cycle.
     * Therefore, older batteries that have gone through many cycles will have lower full charge capacity than newer batteries.
     * When multiple batteries are used simultaneously in a product, the aggregate full charge capacity will be limited by the battery
     * with lowest full charge capacity. To optimize the amount of energy delivered by a battery over its lifetime to a product,
     * batteries should be matched or paired with other batteries of similar full charge capacity. The operational challenges of always
     * using paired batteries can be alleviated using the battery pairing interfaces. This method can then be used to determine if the
     * installed battery combination is a previously assigned pair or not. Only supported by Inspire 2.
     * @param callback  Completion block that receives the getter execution result.
     */
    public abstract void getBatteryPairStatus (DJICommonCallbacks.DJICompletionCallbackWith<DJIBatteryPairStatus> callback);

    /**
     * Gets the battery's cell voltages using a list of objects of type DJIBatteryCell. For the Inspire 1, since the battery has 6 cells, the list will have 6 objects, one for each battery cell.
     Supported by all smart batteries including Osmo.
     * @param callback  Remote execution result callback.
     */
    public abstract void getCellVoltages (DJICommonCallbacks.DJICompletionCallbackWith<DJIBatteryCell[]> callback);

    /**
     * Gets the battery's current warning information, which is one of seven battery warning information,
     * which can be found at the top of DJIBattery. Need to check isSmartBattery() method before using this method.
     * Not supported by Osmo and non-smart battery.
     * @param callback  Remote execution result callback.
     */
    public abstract void getCurrentWarningInformation (DJICommonCallbacks.DJICompletionCallbackWith<DJIBatteryWarningInformation> callback);

    /**
     * Returns the index of the battery. It is useful when the aircraft has multiple batteries.
     * Index starts from 0. For products with only one battery, the index is 0. For Matrice 600,
     * there are printed numbers on the battery boxes. DJIBattery instance with index 0 corresponds to battery compartment number 1.
     * @return  an Integer.
     */
    public int getIndex ()
    {
        return 0;
    }

    /**
     * Gets the legacy serial number of the component. Note that this serial number does not match with the serial number found in the physical component.
     * @param callback  The execution callback with the value(s) returned.
     */
    public abstract void getLegacySerialNumber (DJICommonCallbacks.DJICompletionCallbackWith<String> callback);

    /**
     * Gets the operation to be executed when the cell voltage crosses beneath the Level 1 threshold. It is only supported by stand-alone A3.
     * @param callback  Completion callback that receives the getter execution result.
     */
    public abstract void getLevel1CellVoltageOperation (DJICommonCallbacks.DJICompletionCallbackWith<DJIBatteryLowCellVoltageOperation> callback);

    /**
     * Gets the Level 1 cell voltage threshold in mV.
     * When the cell voltage of the battery is lower than the threshold, Level 1 operation will be executed. It is only supported by stand-alone A3.
     * @param callback  Completion callback that receives the getter execution result.
     */
    public abstract void getLevel1CellVoltageThreshold (DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback);

    /**
     * Gets the operation to be executed when the cell voltage crosses beneath the Level 2 threshold.
     * Gets the operation to be executed when the cell voltage crosses beneath the Level 2 threshold. It is only supported by stand-alone A3.
     * @param callback  Completion block that receives the getter execution result.
     */
    public abstract void getLevel2CellVoltageOperation (DJICommonCallbacks.DJICompletionCallbackWith<DJIBatteryLowCellVoltageOperation> callback);

    /**
     * Gets the Level 2 cell voltage threshold in mV.
     * When the cell voltage of the battery is lower than the threshold, Level 1 operation will be executed. It is only supported by stand-alone A3.
     * @param callback  Completion block that receives the getter execution result.
     */
    public abstract void getLevel2CellVoltageThreshold (DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback);

    /**
     * Returns the number of battery cells.
     * @return
     */
    public int getNumberOfCells ()
    {
        return 0;
    }

    /**
     * Gets the battery's custom self-discharge configuration. Call the isSmartBattery() method before using this method.
     * Not supported by Osmo and non-smart battery.
     * @param callback  Remote execution result error callback.
     */
    public abstract void getSelfDischargeDay (DJICommonCallbacks.DJICompletionCallbackWith<Integer> callback);

    /**
     * Gets the serial number of the component. Note that this serial number does not match with the serial number found in the physical component.
     * @param callback  The execution callback with the value(s) returned.
     */
    public abstract void getSerialNumber (DJICommonCallbacks.DJICompletionCallbackWith<String> callback);

    /**
     * Gets the battery's firmware version. DEPRECATED -> Please refer to getFirmwareVersion in DJIBaseComponent
     * @param callback  Remote execution result callback.
     */
    public void getVersion (DJICommonCallbacks.DJICompletionCallbackWith<String> callback)
    {

    }

    /**
     * Gets the battery's warning information records.
     * The DJI battery keeps the warning information records for the past 30 days using objects of type DJIBatteryWarningInformation.
     * Call the isSmartBattery() method before using this method. Not supported by Osmo and non-smart battery.
     * @param callback  Remote execution result callback.
     */
    public abstract void getWarningInformationRecords (DJICommonCallbacks.DJICompletionCallbackWith<DJIBatteryWarningInformation[]> callback);

    /**
     * This method could be used to detect whether the battery is connected.
     * @return
     */
    public boolean isConnected ()
    {
        return false;
    }

    /**
     * true if the battery is a smart battery. When the connected battery is a DJI smart battery,
     * more information can be otained by communcating with the battery.
     * @return  true if battery is a smart battery, false otherwise.
     */
    public boolean isSmartBattery ()
    {
        return false;
    }

    /**
     * Sets the delegate to receive the battery aggregation information. Only supported by Matrice 600.
     * @param callback
     */
    public static void setBatteryAggregationStateUpdatedCallback (DJIBattery.DJIBatteryAggregationStateUpdatedCallback callback)
    {

    }

    public abstract void setBatteryPairStatus (DJIBatteryPairStatus status, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets up the callback for updating the battery state.
     * @param callback
     */
    public void setBatteryStateUpdateCallback (DJIBattery.DJIBatteryStateUpdateCallback callback)
    {

    }

    /**
     * Sets the operation to be executed when the cell voltage crosses beneath the Level 1 threshold.
     * Sets the operation to be executed when the cell voltage crosses beneath the Level 1 threshold.
     * It can only be set when the motors are off. It is only supported by stand-alone A3.
     * @param operation Level 1 operation.
     * @param callback  Completion callback that receives the setter execution result.
     */
    public abstract void setLevel1CellVoltageOperation (DJIBatteryLowCellVoltageOperation operation, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets the Level 1 cell voltage threshold in mV. When the cell voltage of the battery is lower than the threshold,
     * Level 1 operation will be executed. The valid range is [3600, 4000] mV. When the new value is not 100 mV higher than the Level 2 cell voltage threshold,
     * the Level 2 threshold will be set to (new value - 100) mV. It is only supported by stand-alone A3.
     * @param voltageInmV   Level 1 cell voltage threshold to set.
     * @param callback      Completion callback that receives the setter execution result.
     */
    public abstract void setLevel1CellVoltageThreshold (int voltageInmV, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets the operation to be executed when the cell voltage is under Level 2 threshold. It can only be set when motors are off.
     * It is only supported by stand-alone A3.
     * @param operation Level 2 operation.
     * @param callback  Completion callback that receives the setter execution result.
     */
    public abstract void setLevel2CellVoltageOperation (DJIBatteryLowCellVoltageOperation operation, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets the Level 2 cell voltage threshold in mV. When the cell voltage of the battery is lower than the threshold,
     * Level 2 cell voltage operation will be executed. The valid range is [3500, 3800] mV and must be at least 100 mV lower than the Level 1 voltage threshold.
     * It is only supported by stand-alone A3.
     * @param voltageInmV   Level 2 cell voltage threshold to set.
     * @param callback      Completion callback that receives the setter execution result.
     */
    public abstract void setLevel2CellVoltageThreshold (int voltageInmV, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * When the connected battery is not a smart battery, the user needs to set the number of cells manually.
     * The flight controller uses the number of cells and the cell voltage threshold to determine if the aircraft should go home or land.
     * Only supported when the connected product is A3. It is only supported by stand-alone A3.
     * @param numberOfCells Number of cells inside the battery.
     * @param callback      Remote execution result error callback.
     */
    public abstract void setNumberOfCells (int numberOfCells, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets the battery's custom self-discharge configuration in the range of [1, 10] days. For example,
     * if the value for day is set to 10, the battery will discharge over the course of 10 days. Call the isSmartBattery() method before using this method.
     * Not supported by Osmo and non-smart battery.
     * @param day       Day for self-discharge
     * @param callback  Remote execution result error callback.
     */
    public abstract void setSelfDischargeDay (int day, DJICommonCallbacks.DJICompletionCallback callback);
}

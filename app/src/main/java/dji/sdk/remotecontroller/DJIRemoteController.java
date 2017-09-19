package dji.sdk.remotecontroller;

import dji.common.remotecontroller.DJIRCChargeMobileMode;
import dji.common.remotecontroller.DJIRCControlMode;
import dji.common.remotecontroller.DJIRCGimbalControlDirection;
import dji.common.remotecontroller.DJIRCGimbalControlSpeed;
import dji.common.remotecontroller.DJIRCInfo;
import dji.common.remotecontroller.DJIRCJoinMasterResult;
import dji.common.remotecontroller.DJIRCRequestGimbalControlResult;
import dji.common.remotecontroller.DJIRCToAircraftPairingState;
import dji.common.remotecontroller.DJIRemoteControllerMode;
import dji.common.remotecontroller.JoinMasterData;
import dji.common.util.DJICommonCallbacks;

/**
 *
 */

public abstract class DJIRemoteController
{
    public interface RCBatteryStateUpdateCallback
    {

    }

    public interface RCGpsDataUpdateCallback
    {

    }

    public interface RCHardwareStateUpdateCallback
    {

    }

    public interface RCMasterSlaveStateUpdateCallback
    {

    }

    public interface RCReceiveGimbalControlRequestFromSlaveCallback
    {

    }

    public interface RCRemoteFocusStateUpdateCallback
    {

    }

    public DJIRemoteController()
    {

    }

    /**
     * Enters pairing mode, where the Remote Controller starts pairing with the aircraft.
     * @param callback
     */
    public abstract void enterRCPairingMode(DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Exits pairing mode.
     * @param callback
     */
    public abstract void exitRCPairingMode(DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void getAuthCodeFromMaster(String id, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Starts search by slave Remote Controller for nearby master Remote Controllers.
     * @param callback
     */
    public abstract void getAvailableMasters(DJICommonCallbacks.DJICompletionCallbackWith<DJIRCInfo[]> callback);

    /**
     * Gets the BatteryStateUpdateCallback
     * @return
     */
    public DJIRemoteController.RCBatteryStateUpdateCallback getBatteryStateUpdateCallback()
    {

        return null;
    }

    /**
     * Gets the mode to charge the connected android device.
     * @param callback
     */
    public abstract void getChargeMobileMode(DJICommonCallbacks.DJICompletionCallbackWith<DJIRCChargeMobileMode> callback);

    /**
     * Gets the GimbalControlRequestFromSlaveReceivedCallback
     * @return
     */
    public DJIRemoteController.RCReceiveGimbalControlRequestFromSlaveCallback getGimbalControlRequestFromSlaveReceivedCallback()
    {
        return null;
    }

    /**
     * Get the GPSDataUpdateCallback
     * @return
     */
    public DJIRemoteController.RCGpsDataUpdateCallback getGpsDataUpdateCallback()
    {
        return null;
    }

    /**
     * Get the getHardwareStateUpdateCallback
     * @return
     */
    public DJIRemoteController.RCHardwareStateUpdateCallback getHardwareStateUpdateCallback()
    {
        return null;
    }

    /**
     * Returns the master's information, which includes the ID, name, and password.
     * @param callback
     */
    public abstract void getJoinedMasterNameAndPassword(DJICommonCallbacks.DJICompletionCallbackWithThreeParam<Integer, String, String> callback);

    /**
     * Get legacy serial number of the component.
     * @param callback
     */
    public void getLegacySerialNumber(DJICommonCallbacks.DJICompletionCallbackWith<String> callback)
    {

    }

    /**
     * Returns the state of the master Remote Controller search.
     */
    public abstract void getMasterRCSearchState(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback);

    public abstract void getMasterSlaveId(DJICommonCallbacks.DJICompletionCallbackWith<String> callback);

    /**
     * Gets a list of the nearby remote controllers in mastermode
     * @param callback
     */
    public abstract void getMasters(DJICommonCallbacks.DJICompletionCallbackWith<String[]> callback);

    /**
     * Gets which of the gimbal directions the top left wheel on the Remote Controller will control.
     * @param callback
     */
    public abstract void getRCControlGimbalDirection(DJICommonCallbacks.DJICompletionCallbackWith<DJIRCGimbalControlDirection> callback);

    /**
     * Gets the master Remote Controller's mode.
     * @param callback
     */
    public abstract void getRCControlMode(DJICommonCallbacks.DJICompletionCallbackWith<DJIRCControlMode> callback);

    /**
     * Gets the custom button's tag.
     * @param callback
     */
    public abstract void getRCCustomButtonTag(DJICommonCallbacks.DJICompletionCallbackWithTwoParam<Short, Short> callback);

    /**
     * Gets the Remote Controller's Name
     * @param callback
     */
    public abstract void getRCName(DJICommonCallbacks.DJICompletionCallbackWith<String> callback);

    /**
     * Gets the Remote Controller's password.
     * @param callback
     */
    public abstract void getRCPassword(DJICommonCallbacks.DJICompletionCallbackWith<String> callback);

    /**
     * Gets the GimbalControlRequestFromSlaveReceivedCallback
     * @return
     */
    public DJIRemoteController.RCRemoteFocusStateUpdateCallback getRCRemoteFocusStateUpdateCallback()
    {
        return null;
    }

    /**
     * Gets the pairing status as the Remote Controller is pairing with the aircraft.
     * @param callback
     */
    public abstract void getRCToAircraftPairingState(DJICommonCallbacks.DJICompletionCallbackWith<DJIRCToAircraftPairingState> callback);

    /**
     * Gets the gimbal's pitch speed for the Remote Controller's upper left wheel.
     * @param callback
     */
    public abstract void getRCWheelControlGimbalSpeed(DJICommonCallbacks.DJICompletionCallbackWith<Short> callback);

    /**
     * Gets the Remote Controller's work mode
     * @param callback
     */
    public abstract void getRemoteControllerMode(DJICommonCallbacks.DJICompletionCallbackWithTwoParam<DJIRemoteControllerMode, Boolean> callback);

    /**
     * Get serial number of the component
     * @param callback
     */
    public void getSerialNumber(DJICommonCallbacks.DJICompletionCallbackWith<String> callback)
    {

    }

    /**
     * Gets the current slave's control mode
     * @param callback
     */
    public abstract void getSlaveControlMode(DJICommonCallbacks.DJICompletionCallbackWith<DJIRCControlMode> callback);

    /**
     * Gets the current slave's gimbal pitch, roll, and yaw speed
     * @param callback
     */
    public abstract void getSlaveJoystickControlGimbalSpeed(DJICommonCallbacks.DJICompletionCallbackWith<DJIRCGimbalControlSpeed> callback);

    /**
     * Used by the current master Remote Controller to get all the slaves connected to it
     * @param callback
     */
    public abstract void getSlaveList(DJICommonCallbacks.DJICompletionCallbackWith<DJIRCInfo[]> callback);

    /**
     * Get Remote controller's Firmware Version
     * @param callback
     */
    public abstract void getVersion(DJICommonCallbacks.DJICompletionCallbackWith<String> callback);

    /**
     * This method is designed to provide the connection status of the RC
     * @return
     */

    public boolean isConnected()
    {
        return false;
    }

    /**
     * Query method to check if the Remote controller suport master/slave mode
     * @return
     */
    public abstract boolean isMasterSlaveModeSupported();

    /**
     * QUer method to check if the Remote Controllert usport Remote Focus Changing
     * @return
     */
    public abstract boolean isRCRemoteFocusChekingSupported();

    /**
     * Used by a slave Remote Controller to request to join a master Remote Controller and be able to control the gimbal.
     * @param hostId
     * @param masterName
     * @param masterPassword
     * @param callback
     */
    public abstract void joinMaster(int hostId, String masterName, String masterPassword, DJICommonCallbacks.DJICompletionCallbackWith<DJIRCJoinMasterResult> callback);

    /**
     * Joins the master remote controller with the specific ID.
     * @param mode
     * @param callback
     */
    public abstract void joinMasterWithID(JoinMasterData mode, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Removes a master Remote Controller from the current slave Remote Controller.
     * @param masterId
     * @param callback
     */
    public abstract void removeMaster(int masterId, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Removes a slave
     * @param slaveId
     * @param callback
     */
    public abstract void removeSlave(int slaveId, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Even after a Remote Controller becomes a slave Remote Controller, this method must be called by the slave Remote Controller to request
     * the master Remote Controller to control the gimbal.
     * @param callback
     */
    public abstract void requestGimbalControlRight(DJICommonCallbacks.DJICompletionCallbackWith<DJIRCRequestGimbalControlResult> callback);

    /**
     * When a slave Remote Controller requests a master Remote Controller to control the gimbal, this method is used by a master
     * Remote Controller to respond to the slave Remote Controller's request.
     * @param requesterId
     * @param isAgree
     */
    public abstract void responseRequesterForGimbalControlRight(int requesterId, boolean isAgree);

    /**
     * Sets the BatteryStateUpdateCallback
     * @param batteryStateUpdateCallback
     */
    public void setBatteryStateUpdateCallback(DJIRemoteController.RCBatteryStateUpdateCallback batteryStateUpdateCallback)
    {

    }

    /**
     * Sets the charge mode of a connected android device
     * @param mode
     * @param callback
     */
    public abstract void setChargeMobileMode(DJIRCChargeMobileMode mode, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets gimbalControlRequestFromSlaveReceivedCallback
     * @param gimbalControlRequestFromSlaveReceivedCallback
     */
    public void setGimbalControlRequestFromSlaveReceivedCallback(DJIRemoteController.RCReceiveGimbalControlRequestFromSlaveCallback gimbalControlRequestFromSlaveReceivedCallback)
    {

    }

    /**
     * Sets the GPSDataUpdateCallback
     * @param gpsDataUpdateCallback
     */
    public void setGpsDataUpdateCallback(DJIRemoteController.RCGpsDataUpdateCallback gpsDataUpdateCallback)
    {

    }

    /**
     * Set the HardwareStateUpdateCallback
     * @param hardwareStateUpdateCallback
     */
    public void setHardwareStateUpdateCallback(DJIRemoteController.RCHardwareStateUpdateCallback hardwareStateUpdateCallback)
    {

    }

    /**
     * Sets the authorization code of a master remote controller
     * @param authorizationCode
     * @param callback
     */
    public abstract void setMasterAuthorizationCode(String authorizationCode, DJICommonCallbacks.DJICompletionCallback callback);

    public abstract void setMasterSlaveId(String name, DJICommonCallbacks.DJICompletionCallback callback);

    public void setOnMasterSlaveStateUpdateCallback(DJIRemoteController.RCMasterSlaveStateUpdateCallback callback)
    {

    }

    /**
     * Sets which of the gimbal directions the top left wheel on the Remote Controller will control.
     * @param direction
     * @param callback
     */
    public abstract void setRCControlGimbalDirection(DJIRCGimbalControlDirection direction, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets the Remote Controller's control mode.
     * @param mode
     * @param callback
     */
    public abstract void setRCControlMode(DJIRCControlMode mode, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets custom button tags, which can be used by the user to record user settings.
     * @param tag1
     * @param tag2
     * @param callback
     */
    public abstract void setRCCustomButtonTag(short tag1, short tag2, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets the Remote Contreoller's Name
     * @param name
     * @param callback
     */
    public abstract void setRCName(String name, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets the Remote Controller's password.
     * @param password
     * @param callback
     */
    public abstract void setRCPassword(String password, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets gimbalControlRequestFromSlaveReceivedCallback
     * @param rcRemoteFocusStateUpdateCallback
     */
    public void setRCRemoteFocusStateUpdateCallback(DJIRemoteController.RCRemoteFocusStateUpdateCallback rcRemoteFocusStateUpdateCallback)
    {

    }

    /**
     * Sets the gimbal's pitch speed for the Remote Controller's upper left wheel.
     * @param speed
     * @param callback
     */
    public abstract void setRCWheelControlGimbalSpeed(short speed, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets the Remote Controller's mode.
     * @param mode
     * @param callback
     */
    public abstract void setRemoteControllerMode(DJIRemoteControllerMode mode, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets the current slave's control mode.
     * @param mode
     * @param callback
     */
    public abstract void setSlaveControlMode(DJIRCControlMode mode, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Sets the current slave's gimbal's pitch, roll, and yaw speed.
     * @param speed
     * @param callback
     */
    public abstract void setSlaveJoystickControlGimbalSpeed(DJIRCGimbalControlSpeed speed, DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Returns all available master Remote Controllers nearby.
     * @param callback
     */
    public abstract void startSearchMaster(DJICommonCallbacks.DJICompletionCallback callback);

    /**
     * Used by a slave Remote Controller to stop the search for nearby master Remote Controllers.
     * @param callback
     */
    public abstract void stopSearchMaster(DJICommonCallbacks.DJICompletionCallback callback);

}

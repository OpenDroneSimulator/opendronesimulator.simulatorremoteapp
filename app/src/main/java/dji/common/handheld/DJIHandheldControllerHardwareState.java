package dji.common.handheld;

/**
 *
 *
 * Handheld controller's current state. Used by Osmo Mobile only.
 */

public class DJIHandheldControllerHardwareState
{
    public DJIHandheldControllerHardwareState()
    {

    }

    public DJIHandheldButtonStatus getHandheldButtonStatus()
    {
        return null;
    }

    public JoystickHorizontalDirection getJoystickHorizontalDirection()
    {
        return null;
    }

    public int getJoystickHorizontalPosition()
    {
        return 0;
    }

    public JoystickVerticalDirection getJoystickVerticalDirection()
    {
        return null;
    }

    public int getJoystickVerticalPosition()
    {
        return 0;
    }

    public DJIHandheldTriggerStatus getTriggerStatus()
    {
        return null;
    }

    public boolean isTriggerBeingPressed()
    {
        return false;
    }
}

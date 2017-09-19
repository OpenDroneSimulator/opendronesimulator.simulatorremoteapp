package dji.sdk.mobilerc;

/**
 *
 *
 * A simulated remote controller on the mobile device to control the aircraft when the physical
 * remote controller is absent. The mobile remote controller uses the american style. only
 * supports Mode 2 control style and flight mode P. It is supported by Mavic Pro using WiFi.
 */
public class DJIMobileRemoteController
{
    public DJIMobileRemoteController ()
    {

    }

    /**
     * Gets the horizontal movement value of the left stick.
     * @return  Horizontal movement value of the left stick
     */
    public float getLeftStickHorizontal ()
    {
        return 0f;
    }

    /**
     * Gets the vertical movement value of the left stick.
     * @return  Vertical movement value of the left stick
     */
    public float getLeftStickVertical ()
    {
        return 0f;
    }

    /**
     * Gets the horizontal movement value of the right stick.
     * @return  Horizontal movement value of the right stick
     */
    public float getRightStickHorizontal ()
    {
        return 0f;
    }

    /**
     * Gets the vertical movement value of the right stick.
     * @return  Vertical movement value of the right stick
     */
    public float getRightStickVertical ()
    {
        return 0f;
    }

    /**
     * This is the method for detecting whether the component is connected.
     * @return
     */
    public boolean isConnected ()
    {
        return false;
    }

    /**
     * Simulates the horizontal movement of the left stick, which changes the yaw of the aircraft
     * causing it to rotate horizontally. The valid range is [-1, 1].
     * @param data
     */
    public void setLeftStickHorizontal (float data)
    {

    }

    /**
     * Simulates the vertical movement of the left stick, which changes the aircraft's thrust
     * causing it to raise or lower in elevation. The valid range is [-1, 1].
     * @param data
     */
    public void setLeftStickVertical (float data)
    {

    }

    /**
     * Simulates the horizontal movement of the right stick, which changes the aircraft's roll
     * causing it to fly left or right. The valid range is [-1, 1].
     */
    public void setRightStickHorizontal (float data)
    {

    }

    /**
     * Simulates the vertical movement of the right stick, which changes the the aircraft's pitch
     * causing it to fly forward or backward. The valid range is [-1, 1].
     * @param data
     */
    public void setRightStickVertical (float data)
    {

    }
}

package dji.common.handheld;

import java.util.ArrayList;

/**
 *
 * Pattern used to control a single color (red, green or blue) of the handheld controller's LED.
 */

public class DJIHandheldControllerLEDColorPattern
{
    /**
     * Pattern to control the time varying behaviour of the LED color. Each element of `pattern`
     * is a boolean NSNumber representing the LED on/off state for 0.125 seconds where true means
     * the LED is on. The length of the pattern cannot exceed 32. By default, the array is empty,
     * which will turn the LED color off.
     */
    public ArrayList<Boolean> pattern;

    /**
     * The number of times to repeat the sequence with range[1, 255].
     * A value of 255 will repeat the sequence indefinitelly untill a new command is sent.
     * The default value is 255.
     */
    public int repeatTimes;

    public DJIHandheldControllerLEDColorPattern ()
    {
        repeatTimes = 255;
        pattern = new ArrayList<>();
    }
}

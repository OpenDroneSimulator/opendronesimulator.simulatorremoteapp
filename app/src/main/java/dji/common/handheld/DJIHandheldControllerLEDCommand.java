package dji.common.handheld;

/**
 *
 *
 * Command used to control different colors (red, green and blue) of the handheld controller's LED.
 */

public class DJIHandheldControllerLEDCommand
{
    /**
     * Pattern to control the blue color.
     */
    public DJIHandheldControllerLEDColorPattern	blue;
    /**
     * Pattern to control the green color.
     */
    public DJIHandheldControllerLEDColorPattern	green;
    /**
     * Pattern to control the red color.
     */
    public DJIHandheldControllerLEDColorPattern	red;

    public DJIHandheldControllerLEDCommand()
    {

    }
}

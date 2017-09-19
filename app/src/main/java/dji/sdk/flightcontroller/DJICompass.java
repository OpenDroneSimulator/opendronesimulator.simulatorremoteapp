package dji.sdk.flightcontroller;

import dji.common.flightcontroller.DJICompassCalibrationStatus;
import dji.common.util.DJICommonCallbacks;

/**
 *
 *
 * This class contains important status for the compass of the product, and provides methods to calibrate the compass.
 */

public class DJICompass
{

    public DJICompass()
    {

    }

    public DJICompassCalibrationStatus getCalibrationStatus()
    {
        return null;
    }

    /**
     * Represents the heading in degrees.
     * True North is 0 degrees heading, positive heading is East of North, negative heading is
     * West of North and heading bounds are [-180, 180].
     * @return
     */
    public float getHeading()
    {
        return 0f;
    }

    /**
     * true if the compass has an error. If true, the compass needs calibration.
     */
    public boolean hasError()
    {
        return false;
    }

    /**
     * true if the compass is calibrating
     * @return
     */
    public boolean isCalibrating()
    {
        return false;
    }

    /**
     * Starts compass calibration.
     * @param callback
     */
    public void startCompassCalibration(DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Stops compass calibration.
     * @param callback
     */
    public void stopCompassCalibration(DJICommonCallbacks.DJICompletionCallback callback)
    {

    }


}

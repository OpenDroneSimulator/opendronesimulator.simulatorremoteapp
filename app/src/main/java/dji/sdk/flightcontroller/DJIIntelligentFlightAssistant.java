package dji.sdk.flightcontroller;

import dji.common.flightcontroller.DJIVisionControlState;
import dji.common.util.DJICommonCallbacks;

/**
 *
 */

public class DJIIntelligentFlightAssistant
{
    public interface VisionControlStateUpdatedCallback
    {
        public abstract void onStateUpdated(DJIVisionControlState state);
    }

    /**
     * This protocol provides a interface to update the Intelligent Flight Assistant current state.
     */
    public interface VisionDetectionStateUpdatedCallback
    {

    }

    public DJIIntelligentFlightAssistant()
    {

    }

    /**
     *
     */
    public void destroy()
    {

    }

    /**
     *
     * @param callback
     */
    public void getActiveObstacleAvoidance(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {

    }

    /**
     * Get collision avoidance enabled.
     * @param callback
     */
    public void getCollisionAvoidanceEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {

    }

    /**
     * Gets if landing protection is enabled. It is supported by Mavic Pro, Phantom 4 Pro and Inspire 2.
     * @param callback  The execution callback with the returned value(s).
     */
    public void getLandingProtectionEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {

    }

    /**
     * Gets if precision landing is enabled. It is supported by Phantom 4 Pro and Mavic Pro.
     * @param callback  The execution callback with the returned value(s).
     */
    public void getPrecisionLandingEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {

    }

    /**
     * Gets if upwards avoidance is enabled. It is supported by Inspire 2.
     * @param callback  The execution callback with the returned value(s).
     */
    public void getUpwardsAvoidanceEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {

    }

    /**
     * Get vision position enable.
     * @param callback
     */
    public void getVisionPositioningEnabled(DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {

    }

    /**
     * Enables/disables active obstacle avoidance. When enabled, and an obstacle is moving toward
     * the aircraft, the aircraft will actively fly away from it. If while actively avoiding a
     * moving obstacle, the aircraft detects another obstacle in its avoidance path, it will stop.
     * `CollisionAvoidance` must also be enabled.
     * @param enabled   true to enable the active avoidance.
     * @param callback  Completion callback that receives the setter result.
     */
    public void setActiveObstacleAvoidance(boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Set collision avoidance enabled. When collision avoidance is enabled, the aircraft will stop and try to go around an obstacle when detected.
     * @param enable
     * @param callback
     */
    public void setCollisionAvoidanceEnabled(boolean enable, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Enables/disables landing protection. During auto-landing, the downward facing vision sensor
     * will check if the ground surface is flat enough for a safe landing. If it is not and landing
     * proteciton is `YES`, then landing will abort and need to be manually performed by the user.
     * It is supported by Mavic Pro, Phantom 4 Pro and Inspire 2.
     * @param enabled   True to enable the landing protection.
     * @param callback  The execution callback with the returned execution result.
     */
    public void setLandingProtectionEnabled(boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Enables/disables precision landing. When enabled, the aircraft will record its take-off
     * location visually (as well as with GPS). On a Return-To-Home action the aircraft will attempt
     * to perform a precision landing using the additional visual information. This method only
     * works on a Return-To-Home action when the home location is successfully recorded during
     * take-off, and not changed during flight. It is supported by Phantom 4 Pro and Mavic Pro.
     * @param enabled   True to enable the precise landing.
     * @param callback  The execution callback with the returned execution result.
     */
    public void setPrecisionLandingEnabled(boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Enables/disables upwards avoidance. When the infrared sensor on top of the Inspire 2 detects
     * an obstacle, the aircraft will slow down the ascent speed and maintain a minimum distance
     * (1 meter) from the obstacle. The sensor has a 10-degree horizontal field of view (FOV) and
     * 10-degree vertical FOV. The maximum detection distance is 5 meters. It is supported
     * by Inspire 2.
     * @param enabled   True to enable the upwards avoidance.
     * @param callback  The execution callback with the returned value(s).
     */
    public void setUpwardsAvoidanceEnabled(Boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Callback function that updates the aircraft state controlled by the intelligent flight assistant.
     * @param callback
     */
    public void setVisionControlStateUpdatedcallback(DJIIntelligentFlightAssistant.VisionControlStateUpdatedCallback callback)
    {

    }

    /**
     * Callback function that updates the detection state of each vision sensor.
     * @param callback
     */
    public void setVisionDetectionStateUpdatedCallback(DJIIntelligentFlightAssistant.VisionDetectionStateUpdatedCallback callback)
    {

    }

    /**
     * Set vision positioning enabled. Vision positioning is used to augment GPS to improve location accuracy when hovering and improve velocity calculation when flying.
     * @param enable
     * @param callback
     */
    public void setVisionPositioningEnabled(boolean enable, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }
}

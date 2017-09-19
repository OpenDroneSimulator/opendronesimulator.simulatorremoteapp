package dji.common.flightcontroller;

/**
 * Landing protection status returned by the downward vision sensor.
 */

public enum DJIVisionLandingProtectionStatus
{
    /**
     * The downward vision sensor's analysis failed.
     */
    AnalysisFailed,
    /**
     * 	The downward vision sensor is analyzing the ground at the landing zone.
     */
    Analyzing,
    /**
     * The aircraft is not executing auto-landing or the downward vision sensor has not started to analyze the ground yet.
     */
    None,
    /**
     * Landing area is not considered safe enough for an automatic landing.
     */
    NotSafeToLand,
    /**
     * The ground is considered safe to land on automatically.
     */
    SafeToLand,
    /**
     * 	Unknown.
     */
    Unknown;
}

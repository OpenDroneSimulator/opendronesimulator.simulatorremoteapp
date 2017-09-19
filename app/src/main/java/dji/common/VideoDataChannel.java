package dji.common;

/**
 * Video Data Channel for Lightbridge.
 */
public enum VideoDataChannel
{
    /**
     * 	Video from AV is received by the delegate method.
     */
    AV,
    /**
     * Video from AV or HDMI is received by the delegate method.
     */
    FPVCamera,
    /**
     * Video from HD Gimbal is received by the delegate method.
     */
    HDGimbal,
    /**
     * Video from HDMI is received by the delegate method.
     */
    HDMI,
    /**
     * Unknown
     */
    Unkown;
}

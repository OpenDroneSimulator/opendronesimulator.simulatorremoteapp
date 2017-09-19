package dji.common.remotecontroller;

/**
 * Remote Controller's Remote Focus State The focus product has one dial (focus control) that controls two separate parts of the camera: focal length and aperture. However it can only control one of these at any one time and is an aboslute dial, meaning that a specific rotational position of the dial corresponds to a specific focal length or aperture. This means that whenever the dial control mode is changed, the dial first has to be reset to the new mode's previous dial position before the dial can be used to adjust the setting of the new mode. Example workflow:

 Use dial to set an Aperture of f2.2
 Change dial control mode to focal length (set DJIRCRemoteFocusControlType)
 Use the dial to change the focal length
 Change dial control mode back to aperture
 set DJIRCRemoteFocusControlType
 isFocusControlWorks will now be NO
 Adjust dial back to f2.2
 DJIRCRemoteFocusControlDirection is the direction the dial should be rotated
 isFocusControlWorks will become YES when set back to f2.2
 Now the dial can be used to adjust the aperture.
 */

public class DJIRCRemoteFocusState
{

    public enum DJIRCRemoteFocusControlDirection
    {
        Clockwise, CounterClockwise, Unknown;
    }

    public enum DJIRCRemoteFocusControlType
    {
        Aperture, FocalLength, FocusDistance, Unknown;
    }

    public DJIRCRemoteFocusState.DJIRCRemoteFocusControlType controlType;
    public DJIRCRemoteFocusState.DJIRCRemoteFocusControlDirection direction;
    public boolean isFocusControlWorks;

    public DJIRCRemoteFocusState ()
    {

    }
}

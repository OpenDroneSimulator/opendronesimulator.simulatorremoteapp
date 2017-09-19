package dji.common.remotecontroller;

/**
 *
 */

public class DJIRCHardwareState
{
    public class DJIRCFiveDButton
    {
        /**
         * true if the 5D button is pressed down
         */
        public boolean buttonPressed;

        /**
         * true if 5D button is present
         */
        public boolean isPresent;

        private boolean buttonUp, buttonDown, buttonLeft, buttonRight;

        DJIRCFiveDButton(boolean buttonUp, boolean buttonDown, boolean buttonLeft, boolean buttonRight, boolean buttonPressed)
        {
            buttonUp = buttonUp;
            buttonDown = buttonDown;
            buttonLeft = buttonLeft;
            buttonRight = buttonRight;
            buttonPressed = buttonPressed;
        }

        public DJIRCFiveDButtonDirection getHorizontalMovement ()
        {
            return DJIRCFiveDButtonDirection.Middle;
        }

        public DJIRCFiveDButtonDirection getVerticalMovement ()
        {
            return DJIRCFiveDButtonDirection.Positive;
        }

        public boolean isButtonDown ()
        {
            return buttonDown;
        }

        public boolean isButtonLeft ()
        {
            return buttonLeft;
        }

        public boolean isButtonRight ()
        {
           return buttonRight;
        }

        public boolean isButtonUp ()
        {
            return buttonUp;
        }
    }

    /**
     * Movement direction of the remote controller's 5D button.
     */
    public enum DJIRCFiveDButtonDirection
    {
        Middle,
        Negative,
        Positive
    }

    public static class DJIRCHardwareButton
    {
        private boolean _isButtonDown;

        public DJIRCHardwareButton(boolean isButtonDown)
        {
            _isButtonDown = isButtonDown;
        }

        public boolean buttonDown()
        {
            return _isButtonDown;
        }

        public boolean isPresent()
        {
            return false;
        }
    }

    /**
     * Remote Controller's hardware joystick Summary
     */
    public static class DJIRCHardwareJoystick
    {
        /**
         * Joystick's channel value in the range of [-660, 660]. This value may be different for the aileron, elevator, throttle, and rudder.
         */
        public int value;

        public DJIRCHardwareJoystick(int value)
        {
            value = value;

        }
    }

    /**
     * the hardware left wheel of the Remote Controller
     */
    public static class DJIRCHardwareLeftWheel
    {
        /**
         * Gimbal Dial's (upper left wheel) value in the range of [-660,660], where 0 is untouched and positive is turned in the clockwise direction.
         */
        public int value;

        public DJIRCHardwareLeftWheel()
        {

        }
    }

    /**
     * Current state of the Camera Settings Dial (upper right wheel on the Remote Controller).
     */
    public static class DJIRCHardwareRightWheel
    {
        /**
         * true if the right wheel is present.
         */
        public boolean	isPresent;
        /**
         * Wheel value is in the range of [0, 1320]. The value represents the difference in an operation.
         */
        public int value;
        /**
         * true if the wheel is being pressed.
         */
        public boolean wheelButtonDown;
        /**
         * true if the wheel value has changed.
         */
        public boolean wheelChanged;
        /**
         * true if the wheel is being turned in a counterclockwise direction.
         */
        public boolean wheelDirection;


        public DJIRCHardwareRightWheel()
        {

        }

        public DJIRCHardwareRightWheel(boolean wheelChanged, boolean wheelButtonDown, boolean wheelOffsetSign, short wheelOffset)
        {
            wheelChanged = wheelChanged;
            wheelButtonDown = wheelButtonDown;
            wheelOffsetSign = wheelOffsetSign;
            wheelOffset = wheelOffset;
        }
    }

    public static class DJIRCHardwareTransformationSwitch
    {
        public boolean	isPresent;
        public DJIRCHardwareTransformationSwitchState	transformationSwitchState;

        public DJIRCHardwareTransformationSwitch (DJIRCHardwareTransformationSwitchState state)
        {
            transformationSwitchState = state;
        }
    }

    /**
     * Transformation Switch position states.
     */
    public enum DJIRCHardwareTransformationSwitchState
    {
        /**
         * Deploy landing gear switch state.
         */
        Deploy,
        /**
         * Retract landing gear switch state.
         */
        Retract;
    }

    /**
     * Remote Controller Flight Mode switch position.
     */
    public enum DJIRemoteControllerFlightModeSwitchPosition
    {
        /**
         * Position One
         */
        One,
        /**
         * Position Three
         */
        Three,
        /**
         * Position Two
         */
        Two
    }


    public DJIRCHardwareState.DJIRCHardwareButton customButton1;
    public DJIRCHardwareState.DJIRCHardwareButton customButton2;
    public DJIRCHardwareState.DJIRCFiveDButton dimensionButton;
    public DJIRCHardwareState.DJIRemoteControllerFlightModeSwitchPosition flightModeSwitchPosition;
    public DJIRCHardwareState.DJIRCHardwareButton goHomeButton;
    public DJIRCHardwareState.DJIRCHardwareJoystick leftHorizontal;
    public DJIRCHardwareState.DJIRCHardwareJoystick leftVertical;
    public DJIRCHardwareState.DJIRCHardwareLeftWheel leftWheel;
    public DJIRCHardwareState.DJIRCHardwareButton pauseButton;
    public DJIRCHardwareState.DJIRCHardwareButton playbackButton;
    public DJIRCHardwareState.DJIRCHardwareButton recordButton;
    public DJIRCHardwareState.DJIRCHardwareJoystick rightHorizontal;
    public DJIRCHardwareState.DJIRCHardwareJoystick rightVertical;
    public DJIRCHardwareState.DJIRCHardwareRightWheel rightWheel;
    public DJIRCHardwareState.DJIRCHardwareButton shutterButton;
    public DJIRCHardwareState.DJIRCHardwareTransformationSwitch transformSwitch;


    public DJIRCHardwareState ()
    {

    }

    public DJIRCHardwareState (DJIRCHardwareState.DJIRCHardwareJoystick joystickValueAileron, DJIRCHardwareState.DJIRCHardwareJoystick joystickValueElevator, DJIRCHardwareState.DJIRCHardwareJoystick joystickValueThrottle, DJIRCHardwareState.DJIRCHardwareJoystick joystickValueRudder, DJIRCHardwareState.DJIRCHardwareLeftWheel leftWheelValue, DJIRCHardwareState.DJIRCHardwareRightWheel rightWheelValue, DJIRCHardwareState.DJIRCHardwareTransformationSwitch transformSwitch, DJIRCHardwareState.DJIRemoteControllerFlightModeSwitchPosition flightModeSwitch, DJIRCHardwareState.DJIRCHardwareButton isGoHomeButtonDown, DJIRCHardwareState.DJIRCHardwareButton isRecordButtonDown, DJIRCHardwareState.DJIRCHardwareButton isShutterbuttonDown, DJIRCHardwareState.DJIRCHardwareButton isPlaybackButtonDown, DJIRCHardwareState.DJIRCHardwareButton isCustomButton1Down, DJIRCHardwareState.DJIRCHardwareButton isCustomButton2Down, DJIRCHardwareState.DJIRCFiveDButton dimensionButton)
    {

    }
}

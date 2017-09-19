package com.drnsmltr.quadrocopterremote.virtualcontroller;

import android.widget.ImageView;

import com.drnsmltr.quadrocopterremote.model.Direction;

import dji.common.flightcontroller.DJIVirtualStickFlightControlData;

/**
 *
 *
 * Holds the virtual joysticks and is able to calculate the new position of the sticks. Should be combined with an input listener
 * for the corresponding ImageViews.
 */

public class Joystick
{
    private static final String TAG = Joystick.class.getSimpleName();



    /**
     * DJI Variables
     */
    private float _pitch;
    private float _yaw;
    private float _roll;
    private float _throttle;

    /**
     * LeftStick
     */
    private float _leftStickPower;
    private float _leftStickAngle;

    private float _knobXResPosLeft;
    private float _knobYResPosLeft;

    /**
     * The Knob on the left joystick
     */
    ImageView _mainKnobLeft;
    ImageView _topKnobLeft;

    private boolean _firstTouchLeft = true;


    /**
     * RightStick
     */
    private float _rightStickPower;
    private float _rightStickAngle;

    private float _knobXResPosRight;
    private float _knobYResPosRight;

    /**
     * The Knob on the right joystick
     */
    ImageView _mainKnobRight;
    ImageView _topKnobRight;

    private boolean _firstTouchRight = true;


    /**
     * Constructor
     * @param mainKnobLeft      The underlaying stick of the left joystick
     * @param topKnobLeft       The upper knob which lays on the mainKnob of the left joystick
     * @param mainKnobRight     The underlaying stick of the right joystick
     * @param topKnobRight      The upper knob which lays on the mainKnob of the right joystick
     */
    public Joystick(ImageView mainKnobLeft, ImageView topKnobLeft, ImageView mainKnobRight, ImageView topKnobRight)
    {
        _mainKnobLeft = mainKnobLeft;
        _topKnobLeft = topKnobLeft;
        _mainKnobRight = mainKnobRight;
        _topKnobRight = topKnobRight;

        _pitch = 0f;
        _yaw = 0f;
        _throttle = 0f;
        _roll = 0f;
    }


    /**
     * Sets up the variables for the transmitted direction
     *
     * @param direction "left" or "right"
     * @return
     */
    public void firstTouch(Direction direction)
    {
        if(direction == Direction.LEFT) {
            _knobXResPosLeft = _topKnobLeft.getX() + _topKnobLeft.getWidth() / 2;
            _knobYResPosLeft = _topKnobLeft.getY() + _topKnobLeft.getHeight() / 2;

            setLeftStickFirstTouched();
        }else if(direction == Direction.RIGHT)
        {
            _knobXResPosRight = _topKnobRight.getX() + _topKnobRight.getWidth() / 2;
            _knobYResPosRight = _topKnobRight.getY() + _topKnobRight.getHeight() / 2;

            setRightStickFirstTouched();
        }

    }

    /**
     * Calculates and sets the new position of the topknob related to the transmitted direction.
     * @param direction of the input, can be "left" or "right"
     * @param inputPosX     x position of the touch input as float
     * @param inputPosY     y position of the touch input as float
     */
    public void calculateInput(Direction direction, float inputPosX, float inputPosY)
    {
        float power, angle, hypotenuseC, radius;

        float resPosX = getProperResPosX(direction);    // original x position of the top knob
        float resPosY = getProperResPosY(direction);    // original y position of the top knob

        // The bottom knob
        ImageView bottomKnobIV = getProperMainKnob(direction);

        // The Top Knob which will be moved
        ImageView topKnobIV = getProperTopKnob(direction);

        // x and y position of the touch input
        float x = inputPosX - topKnobIV.getWidth() / 2;
        float y = inputPosY - topKnobIV.getHeight() / 2;

        // subtracts the origin of the bottomknob from the touch input points
        float dx = inputPosX - resPosX;
        float dy = inputPosY - resPosY;

        // Calculates the radius of the bottomknob circle
        radius = bottomKnobIV.getWidth() / 2;

        // calculates the angle of the points
        angle = (float) Math.atan(Math.abs(dy/dx));

        // Calculates the hypotenuse of the points
        hypotenuseC = (float) Math.sqrt(dx*dx+dy*dy);

        // If the hypotenuse is larger than the radius of the bottom knob circle
        if(hypotenuseC > radius)
        {
            power = 100;

            if(dx > 0 && dy > 0) // Bottom Right of the bottom knob circle
            {
                x = (float) (resPosX + (radius * Math.cos(angle))) - topKnobIV.getWidth() / 2;
                y = (float) (resPosY + (radius * Math.sin(angle))) - topKnobIV.getHeight() / 2;
            }else if(dx < 0 && dy < 0) // Top Left of the bottom knob circle
            {
                x = (float) (resPosX - (radius * Math.cos(angle))) - topKnobIV.getWidth() / 2;
                y = (float) (resPosY - (radius * Math.sin(angle))) - topKnobIV.getHeight() / 2;
            }
            else if(dx > 0 && dy < 0) // Top Right of the bottom knob circle
            {
                x = (float) (resPosX + (radius * Math.cos(angle))) - topKnobIV.getWidth() / 2;
                y = (float) (resPosY - (radius * Math.sin(angle))) - topKnobIV.getHeight() / 2;
            }else if(dx <0 && dy > 0) // Bottom Left of the bottom knob circle
            {
                x = (float) (resPosX - (radius * Math.cos(angle))) - topKnobIV.getWidth() / 2;
                y = (float) (resPosY + (radius * Math.sin(angle))) - topKnobIV.getHeight() / 2;
            }
        }else
        {
            power = (hypotenuseC / radius) * 100.0f;
        }


        // Throttle/Pitch/Yaw/Roll erfassen
        float xMainKnobCenter = getXCenterPositionPoint(direction);
        float yMainKnobCenter = getYCenterPositionPoint(direction);

        float percentFromCenterToOutlineX = 0.0f;

        // inputPosX & Y sind die eingabepunkte, jetzt überprüfen wir zunächst, in welcher Hälfte sich die Eingabe für jeweils X und Y befindet
        // Check the X input
        if(inputPosX > xMainKnobCenter) // Rechte Hälfte des Kreises
        {
            float inputPosXSubtracted = inputPosX - xMainKnobCenter; // Inputposition ist weiter rechts als der Mittelpunkt des Knopfes, also abziehen damit später von 0 -> punkt -> Außenlinie
            float xOutlineRight = _mainKnobLeft.getWidth() / 2; // Der maximal erreichbare Punkt
            percentFromCenterToOutlineX = inputPosXSubtracted / xOutlineRight;   // Prozentrechnung um den Anteil von der Position zur Außenlinie auszurechnen
            if(percentFromCenterToOutlineX > 1.0f)
            {
                percentFromCenterToOutlineX = 1.0f;
            }
        }else if(inputPosX < xMainKnobCenter)   // Linke Hälfte des Kreises
        {
            float inputPosXSubtracted = xMainKnobCenter - inputPosX;
            float xOutlineLeft = _mainKnobLeft.getWidth() / 2;
            percentFromCenterToOutlineX = inputPosXSubtracted / xOutlineLeft * -1;
            if(percentFromCenterToOutlineX < -1.0f)
            {
                percentFromCenterToOutlineX = -1.0f;
            }
        }else if(inputPosX > xMainKnobCenter + _mainKnobLeft.getWidth() / 2) // über das xMaximum hinaus
        {
            percentFromCenterToOutlineX = 1f;
        }else if(inputPosX < xMainKnobCenter - _mainKnobLeft.getWidth() / 2)
        {
            percentFromCenterToOutlineX = -1f;
        }

        float percentFromCenterToOutlineY = 0.0f;

        // Check the Y Input
        if(inputPosY > yMainKnobCenter) // Untere Hälfte des Kreises
        {
            float inputPosYSubtracted = inputPosY - yMainKnobCenter;
            float yOutlineBottom = _mainKnobLeft.getWidth() / 2;
            percentFromCenterToOutlineY = inputPosYSubtracted / yOutlineBottom;

            if(percentFromCenterToOutlineY > 1.0f)
            {
                percentFromCenterToOutlineY = 1.0f;
            }
        }else if(inputPosY < yMainKnobCenter)
        {
            float inputPosYSubtracted = yMainKnobCenter - inputPosY;
            float yOutlineTop = _mainKnobLeft.getWidth() / 2;
            percentFromCenterToOutlineY = inputPosYSubtracted / yOutlineTop * -1;
            if(percentFromCenterToOutlineY < -1.0f)
            {
                percentFromCenterToOutlineY = -1.0f;
            }
        }

        // Sets the new position of the knob image view
        topKnobIV.setX(x);
        topKnobIV.setY(y);

        // The calculated values are set to the classvalues
        setDroneControlValues(percentFromCenterToOutlineX, percentFromCenterToOutlineY, direction);

        // Debugging purposes + ROTATION IN GRAD IM KREIS
        float newAngle = (float) Math.atan(dy/dx);
        float angleDegrees = (newAngle * 180) / (float) Math.PI;

        if(((x + topKnobIV.getWidth() / 2) > resPosX) && angleDegrees < 0)  // Right Side of the circle
        {
            angleDegrees += 360.0f;
        }else if((x + topKnobIV.getWidth() / 2) < resPosX) // Left side of the circle
        {
            angleDegrees += 180.0f;
        }

        if(direction == Direction.LEFT)
        {
            _leftStickAngle = angleDegrees;
            _leftStickPower = power;
        }else if(direction == Direction.RIGHT)
        {
            _rightStickAngle = angleDegrees;
            _rightStickPower = power;
        }
    }

    /**
     * Sets the transmitted values to the values which are corresponding to the transmitted direction
     *
     * @param xValue    sets 'yaw' for left direction, 'roll' for right direction
     * @param yValue    sets 'throttle' for left direction, 'pitch' for right direction
     * @param direction wether 'left' or 'right
     */
    private void setDroneControlValues(float xValue, float yValue, Direction direction)
    {
        if(direction == Direction.LEFT)
        {
            _yaw = xValue;
            _throttle = yValue;
        }else if(direction == Direction.RIGHT)
        {
            _roll = xValue;
            _pitch = yValue;
        }
    }

    /**
     * Returns the Y-value for the centerpoint of the mainknob corresponding to the transmitted direction of the stick
     * @param direction 'left' or 'right'
     * @return
     */
    private float getYCenterPositionPoint(Direction direction)
    {
        float yCenterPoint = 0.0f;

        if(direction == Direction.LEFT) {
            yCenterPoint = _mainKnobLeft.getY() + _mainKnobLeft.getHeight() / 2;
        }else if(direction == Direction.RIGHT)
        {
            yCenterPoint = _mainKnobRight.getY() + _mainKnobRight.getHeight() / 2;
        }

        return yCenterPoint;
    }

    /**
     * Returns the X-value for the centerpoint of the mainknob corresponding to the transmitted direction of the stick
     * @param direction 'left' or 'right'
     * @return
     */
    private float getXCenterPositionPoint(Direction direction)
    {
        float xCenterPoint = 0.0f;

        if(direction == Direction.LEFT) {
            xCenterPoint = _mainKnobLeft.getX() + _mainKnobLeft.getWidth() / 2;
        }else if(direction == Direction.RIGHT)
        {
            xCenterPoint = _mainKnobRight.getX() + _mainKnobRight.getWidth() / 2;
        }

        return xCenterPoint;
    }


    /**
     * Returns the corresponding reset X-position to the transmitted direction
     * @param direction
     * @return
     */
    private float getProperResPosX(Direction direction)
    {
        if(direction == Direction.LEFT)
        {
            return _knobXResPosLeft;
        }else if(direction == Direction.RIGHT)
        {
            return _knobXResPosRight;
        }else
        {
            return 0f;
        }
    }

    /**
     * Returns the corresponding reset Y-position to the transmitted direction
     * @param direction
     * @return
     */
    private float getProperResPosY(Direction direction)
    {
        if(direction == Direction.LEFT)
        {
            return _knobYResPosLeft;
        }else if(direction == Direction.RIGHT)
        {
            return _knobYResPosRight;
        }else
        {
            return 0f;
        }
    }

    /**
     *  Returns the topknob to the corresponding transmitted direction
     * @param direction for which the topknob should be returned
     * @return
     */
    public ImageView getProperTopKnob(Direction direction)
    {
        if(direction == Direction.LEFT)
        {
            return _topKnobLeft;
        }else if(direction == Direction.RIGHT)
        {
            return _topKnobRight;
        }else
        {
            return null;
        }
    }

    /**
     * Returns the mainkob to the corresponding transmitted direction
     * @param direction for which the mainkob should be returned
     * @return
     */
    private ImageView getProperMainKnob(Direction direction)
    {
        if(direction == Direction.LEFT)
        {
            return _mainKnobLeft;
        }else if(direction == Direction.RIGHT)
        {
            return _mainKnobRight;
        }else
        {
            return null;
        }
    }

    /**
     * Resets the joystick position for the related direction and also its allocated values
     * @param direction left or right joystick
     */
    public void resetJoystickPosition(Direction direction)
    {
        ImageView topKnob = getProperTopKnob(direction);

        if(direction == Direction.LEFT) {
            topKnob.setX(_knobXResPosLeft - topKnob.getWidth() / 2);
            topKnob.setY(_knobYResPosLeft - topKnob.getHeight() / 2);

            _yaw = 0f;
            _throttle = 0f;

        }else if(direction == Direction.RIGHT)
        {
            topKnob.setX(_knobXResPosRight - topKnob.getWidth() / 2);
            topKnob.setY(_knobYResPosRight - topKnob.getHeight() / 2);

            _pitch = 0f;
            _roll = 0f;
        }
    }


    /**
     * Returns the current angle of the leftstick
     * @return
     */
    public float getLeftStickAngle()
    {
        return _leftStickAngle;
    }

    /**
     * Returns the current power of the leftstick
     * @return
     */
    public float getLeftStickPower()
    {
        return _leftStickPower;
    }

    /**
     * Returns the current angle of the leftstick
     * @return
     */
    public float getRightStickAngle()
    {
        return _rightStickAngle;
    }

    /**
     * Returns the current power of the leftstick
     * @return
     */
    public float getRightStickPower()
    {
        return _rightStickPower;
    }

    /**
     * Sets the left stick to be touched for the first time
     */
    private void setLeftStickFirstTouched()
    {
        _firstTouchLeft = false;
    }

    /**
     * Returns if the left stick has already been touched
     * @return
     */
    public boolean isLeftStickFirstTouched()
    {
        return _firstTouchLeft;
    }

    /**
     * Sets the left stick to be touched for the first time
     */
    private void setRightStickFirstTouched()
    {
        _firstTouchRight = false;
    }

    /**
     * Returns if the left stick has already been touched
     * @return
     */
    public boolean isRightStickFirstTouched()
    {
        return _firstTouchRight;
    }

    /**
     * Gets value for roll
     * @return
     */
    public float getRoll()
    {
        return _roll;
    }

    /**
     * Gets value for pitch
     * @return
     */
    public float getPitch()
    {
        return _pitch;
    }

    /**
     * Gets value for throttle
     * @return
     */
    public float getThrottle()
    {
        return _throttle;
    }

    /**
     * Gets value for yaw
     * @return
     */
    public float getYaw()
    {
        return _yaw;
    }


    /**
     * Fetches the needed data from the joystick and returns a DJIVirtualStickFlightControlData object
     * @return  an DJIVirtualStickFlightControlData object
     */
    public DJIVirtualStickFlightControlData getVirtualStickFlightControlData()
    {
        DJIVirtualStickFlightControlData data = new DJIVirtualStickFlightControlData(_pitch, _roll, _yaw, _throttle);
        return data;
    }
}

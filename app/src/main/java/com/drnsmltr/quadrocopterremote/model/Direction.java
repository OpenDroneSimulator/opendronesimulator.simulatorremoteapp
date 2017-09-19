package com.drnsmltr.quadrocopterremote.model;

/**
 *
 * Defines allowed directions, mostly used for the positioning of a joystick
 */
public enum Direction
{
    LEFT("left"), RIGHT("right");

    private String _direction;

    Direction(String direction)
    {
        _direction = direction;
    }

    public String toString()
    {
        return _direction;
    }
}

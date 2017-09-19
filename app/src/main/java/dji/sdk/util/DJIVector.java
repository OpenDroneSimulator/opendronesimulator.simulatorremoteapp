package dji.sdk.util;

/**
 * A cartesian vector in 3D space.
 */

public class DJIVector
{
    public float x;
    public float y;
    public float z;

    /**
     * Constructor
     * @param x
     * @param y
     * @param z
     */
    DJIVector(float x, float y, float z)
    {
        x = x;
        y = y;
        z = z;
    }
}

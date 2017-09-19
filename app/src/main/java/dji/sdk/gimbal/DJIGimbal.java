package dji.sdk.gimbal;

/**
 *
 *
 * DJIGimbal is the class for controlling the view of the drone. If you want to have a practical view and want to have a first person view of the drone, gimbal could provide a special view for you. Also, if the objective is only focusing on one direction, the DJIGimbal could automatically stabilize the gimbal.

 You could use the DJIGimbal class to change the angle for detecting objects. However, except the Inspire 1 series, pitch of the gimbal is the only one direction which could be changed. Other directions, like roll and yaw, should be adjusted by turning the heading of the drone. The gimbal has an acceleromoter and gyroscope that enable it to determine the orientation and position of the camera at any moment, and it stabilizes the camera through rotation around 3 axes. These rotational directions, known as pitch, yaw, and roll, completely describe where the camera is pointing. Each axis has a motor. The Inertial Measurement Unit (IMU) on the gimbal measures changes in rotation about all 3 axes, and compensates through the gimbal's motors. This is how the camera remains completely stable. The motor on each axis has stops (limits of movement), having a range of motion corresponding to a range of angular values, such as -180 to 180 degrees. The gimbal also operates according to a time component, which determines how quickly it moves through space to stabilize the camera.

 Axes of Rotation
 Yaw measures an object’s rotation about the vertical axis. Adjusting the yaw will keep the aircraft horizontal, but change the direction it is facing.
 Pitch measures an object’s rotation about the lateral axis. Adjusting the pitch will tilt the aircraft forwards or backwards.
 Roll measures an object’s rotation about the longitudinal axis. Adjusting the roll will tilt the aircraft left or right.
 */

public class DJIGimbal
{
}

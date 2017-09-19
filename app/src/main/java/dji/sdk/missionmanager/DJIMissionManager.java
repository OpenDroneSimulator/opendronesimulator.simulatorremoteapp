package dji.sdk.missionmanager;

/**
 *
 *
 * This class manages the execution cycle for a mission. To execute a mission,
 * normally the user must first invoke prepareMission() to prepare the mission.
 * Then the user can call startMissionExecution() to start the prepared mission.
 * The user can also pause, resume, or stop an executing mission if the mission supports the operation.
 */

public class DJIMissionManager
{
    /**
     * This interface provides the method to update mission progress status.
     */
    interface MissionProgressStatusCallback
    {
        /**
         * Mission execution state update callback. Returns current mission and status. For the waypoint mission, it will include the mission state, target waypoint index, waypoint execution state, and errors if any occur.
         * @param progressStatus    Mission progress object
         */
       public abstract void	missionProgressStatus(DJIMission.DJIMissionProgressStatus progressStatus);
    }
}

package dji.sdk.missionmanager;

import dji.common.error.DJIError;

/**
 *
 */

public abstract class DJIMission
{

    public interface DJIMissionProgressHandler
    {
        public abstract void	onProgress(DJIMission.DJIProgressType type, float progress);
    }

    /**
     * A class representing the progress of an executing mission.
     */
    public static class DJIMissionProgressStatus
    {
        /**
         * An error occurred during mission execution.
         * @return
         */
        public DJIError getError()
        {
            return new DJIError();
        }
    }


    public enum DJIMissionType
    {
        ActiveTrack,
        Custom,
        Followme,
        Hotpoint,
        Panorama,
        TapFly,
        Unknown,
        Waypoint
    }

    public enum DJIProgressType
    {
        Custom,
        Download,
        Execute,
        Upload
    }

    /**
     * The class is an abstract class representing a mission that can be executed by the mission manager.
     */
    public DJIMission()
    {

    }

    public boolean isPausable ()
    {
        return false;
    }
}

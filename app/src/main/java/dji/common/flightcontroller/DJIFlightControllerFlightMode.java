package dji.common.flightcontroller;

/**
 *
 */

public enum DJIFlightControllerFlightMode
{
    AssistedTakeOff, Atti, AttiCourseLock, AttiHover, AttiLanding, AttiLimited, AutoLanding,
    AutoTakeOff, ClickGo, ConfirmLanding, FPV, Farming, GPSAtti, GPSAttiLimited, GPSBlake,
    GPSCourseLock, GPSFollowMe, GPSGentle, GPSHomeLock, GPSHotPoint, GPSNovice, GPSSport,
    GPSWaypoint, GoHome, Hover, Joystick, Manual, MotorsJustStarted, NaviAdvGoHome, NaviAdvLanding,
    PANO, Pointing, TerrainTracking, TrackHeadLock, Tracking, TripodGPS, Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static DJIFlightControllerFlightMode find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

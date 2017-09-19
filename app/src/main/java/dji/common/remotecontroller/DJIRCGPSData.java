package dji.common.remotecontroller;

/**
 *
 */

public class DJIRCGPSData
{
    public class DJIRCGpsTime
    {
        byte day;
        byte hour;
        byte minute;
        byte month;
        byte second;
        int year;

        public DJIRCGpsTime(byte hour, byte minute, byte second, int year, byte month, byte day)
        {
            hour = hour;
            minute = minute;
            second = second;
            year = year;
            month = month;
            day = day;
        }

        public DJIRCGpsTime()
        {

        }

    }

    public float accuracy;
    public boolean isValid;
    public double latitude;
    public double longitude;
    public int satelliteCount;
    public float speedEast;
    public float speedNorth;
    public DJIRCGPSData.DJIRCGpsTime time;

    public DJIRCGPSData()
    {

    }

    public DJIRCGPSData (DJIRCGPSData.DJIRCGpsTime time, double latitude, double longitude, float speedEast, float speedNorth, int satelliteCount, float accuracy, boolean isValid)
    {
        time = time;
        latitude = latitude;
        longitude = longitude;
        speedEast = speedEast;
        speedNorth = speedNorth;
        satelliteCount = satelliteCount;
        accuracy = accuracy;
        isValid = isValid;
    }
}

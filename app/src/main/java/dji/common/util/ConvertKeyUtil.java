package dji.common.util;

import java.util.HashMap;

/**
 * Created by Yanneck on 17.02.2017.
 *
 * This class will map the external keys to internal keys (Specially for the flight controller keys and gimbal internal keys).
 */

public class ConvertKeyUtil
{
    public static HashMap<String, String> flightControllerConvertMap;
    public static HashMap<String, String> gimbalConvertMap;

    public ConvertKeyUtil ()
    {
        flightControllerConvertMap = new HashMap<>();
        gimbalConvertMap = new HashMap<>();
    }
}

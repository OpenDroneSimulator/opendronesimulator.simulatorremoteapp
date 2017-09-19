package com.drnsmltr.quadrocopterremote.parsing;

import android.util.Log;

import com.drnsmltr.quadrocopterremote.model.Direction;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 *
 * Used to create message strings to be sent to the simulator
 */

public class MessageParser
{
    private static final String TAG = MessageParser.class.getSimpleName();

    /**
     * Returns an String in json format for the given parameters
     * @param direction left or right
     * @param angle as float in degrees
     * @param power from 0 to 100
     * @return  A Json object as String in the format {"Direction": Value, "Angle": Value, "Power": Value}
     */
    public String parseAsJSON(Direction direction, float angle, float power)
    {
        String jsonString = "";

        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("Direction", direction.toString());
            jsonObject.put("Angle", angle);
            jsonObject.put("Power", power);

            jsonString = jsonObject.toString();

        }catch (JSONException e)
        {
            Log.d(TAG, "Power or Angle value couldn't be put into the json object.");
        }
        return jsonString;
    }

    /**
     *  Returns an String in json format for the given parameters
     * @param pitch     Value which tilts the aircraft forwards or backwards
     * @param roll      Value which tilts the aircraft left or right
     * @param yaw       Value which lets the aircraft rotate and so changes the heading of it
     * @param throttle  Value which lets the aircraft move up or down
     * @return  A Json object as String in the format {"Pitch": Value, "Roll": Value, "Yaw": Value, "Throttle": Value}
     */
    public String parseAsJSON(float pitch, float roll, float yaw, float throttle)
    {
        String jsonString = "";

        JSONObject jsonObject = new JSONObject();

        // Setting up the JSON-Object
        try {
            jsonObject.put("Pitch", pitch);
            jsonObject.put("Roll", roll);
            jsonObject.put("Yaw", yaw);
            jsonObject.put("Throttle", throttle);

            jsonString = jsonObject.toString();

        }catch (JSONException e)
        {
            Log.d(TAG, "Pitch, Roll, Yaw or Throttle could not be put into the JSON-Object.");
        }
        return jsonString;
    }


}

package dji.common.airlink;

/**
 * This class represents the power spectral density of a frequency slice. Only supported by Mavic Pro.
 */

public class FrequencyInterference
{

    float _from;
    float _to;
    byte _rssi;

    FrequencyInterference(float from, float to, byte rssi)
    {
        _from = from;
        _to = to;
        _rssi = rssi;
    }

    public float frequencyFrom()
    {
        return _from;
    }

    public float frequencyTo()
    {
        return _to;
    }

    public byte rssi()
    {
        return _rssi;
    }
}

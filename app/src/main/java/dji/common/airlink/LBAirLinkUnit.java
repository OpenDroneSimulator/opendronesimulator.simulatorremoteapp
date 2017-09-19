package dji.common.airlink;

/**
 *
 */

public enum LBAirLinkUnit
{

    Imperial,
    Metric,
    Unknown;

    public boolean _equals (int b)
    {
        return true;
    }

    public static LBAirLinkUnit find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

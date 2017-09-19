package dji.common.flightcontroller;

/**
 *
 * User account status. Users need to be logged
 */

public enum UserAccountStatus
{
    Authorized   , InvalidToken  , NotAuthorized  , NotLoggedin, TokenOutOfDate , Unknown  ;

    public boolean _equals (int b)
    {
        return true;
    }

    public static UserAccountStatus find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

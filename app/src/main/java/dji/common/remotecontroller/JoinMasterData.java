package dji.common.remotecontroller;

/**
 *
 */

public class JoinMasterData
{
    String _authCode;
    String _masterId;

    public JoinMasterData()
    {
        _authCode = "";
        _masterId = "";
    }

    public String getAuthCode()
    {
        return _authCode;
    }

    public String getMasterId()
    {
        return _masterId;
    }

    public void setAuthCode(String authCode)
    {
        _authCode = authCode;
    }

    public void setMasterId(String masterId)
    {
        _masterId = masterId;
    }
}

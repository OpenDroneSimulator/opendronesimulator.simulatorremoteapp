package dji.common.remotecontroller;

/**
 *
 * This class contains the information of a remote controller.
 */
public class DJIRCInfo
{
    /**
     * Remote controller's control permissions
     */
    public DJIRCControlPermission _controlPermission;

    /**
     * Remote Controller's unique identifier
     */
    public int _identifier;

    /**
     * Remote Controller's name
     */
    public String _name;

    /**
     * Remote Controller's password, which should be
     */
    public String _password;

    /**
     * Signal quality of a connected master or slave Remote Controller
     */
    public short _signalQuality;


    public DJIRCInfo(int identifier, String name, String password, short signalQuality, DJIRCControlPermission controlPermission)
    {
        _identifier = identifier;
        _name = name;
        _password = password;
        _signalQuality = signalQuality;
        _controlPermission = controlPermission;
    }
}

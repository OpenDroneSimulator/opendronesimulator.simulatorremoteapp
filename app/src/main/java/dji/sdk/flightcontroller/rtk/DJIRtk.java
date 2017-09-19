package dji.sdk.flightcontroller.rtk;

import dji.common.flightcontroller.DJIRtkState;
import dji.common.util.DJICommonCallbacks;

/**
 *
 */

public class DJIRtk
{
    public interface UpdateRtkStateCallback
    {
        /**
         * Callback method that updates the RTK state data.
         */
        public abstract void onRtkStateUpdated(DJIRtkState state);
    }

    public DJIRtk()
    {

    }

    public void destroy()
    {

    }

    /**
     * return true if RTK is supported.
     * @return
     */
    public boolean getIsRtkSupported()
    {
        return false;
    }

    /**
     * Enables RTK positioning. Disable RTK when in poor signal environments
     * where incorrect positioning information might might controlling the aircraft difficult.
     * @param enable
     * @param callback
     */
    public void setRtkEnabled(boolean enable, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    public void setUpdateRtkStateCallback(DJIRtk.UpdateRtkStateCallback callback)
    {

    }
}

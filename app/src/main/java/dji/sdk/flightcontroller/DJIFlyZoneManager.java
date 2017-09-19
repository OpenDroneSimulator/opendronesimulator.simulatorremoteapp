package dji.sdk.flightcontroller;

import android.content.Context;

import java.util.ArrayList;

import dji.common.flightcontroller.DJIFlyZoneInformation;
import dji.common.flightcontroller.FlyForbidStatus;
import dji.common.flightcontroller.UserAccountStatus;
import dji.common.util.DJICommonCallbacks;

/**
 *
 *
 * This class manages the Geospatial Environment Online (GEO) system which provides warning,
 * enhanced warning, authorization and restricted fly zone information. Warning zones have no flight
 * restrictions. Enhanced warning, authorization and restricted fly zones do not allow flight by default.
 * Enhanced warning zones can be unlocked once the user is logged into their DJI account. Authoirzation
 * zones can be unlocked once the user is logged into their DJI account, and that account has been
 * authorized to unlock authorization zones. Restricted zones cannot be unlocked using the GEO system.
 * Use of the geographic information provided DJIFlyZoneManager is restricted. Refer to the DJI Developer
 * Policy sent when signing up for Mobile SDK v3.3 Beta.
 */

public class DJIFlyZoneManager
{
    public interface FlyForbidStatusUpdatedCallback
    {
        public abstract void onFlyForbidStatusUpdated (FlyForbidStatus status);
    }


    /**
     * After invoking this method, a dialog redirecting users to log into their DJI account will be shown.
     * After the login process, if the account has not been authorized to unlock authorization zones,
     * the dialog will then redirect users to authorize their account.
     * @param context       	The android activity's or view's context.
     * @param callback         The execution callback with the returned execution result.
     */
    public void LogIntoDJIUserAccount (Context context, DJICommonCallbacks.DJICompletionCallbackWith<UserAccountStatus> callback)
    {

    }

    public void destroy ()
    {

    }

    /**
     * Gets the account status.
     * @return  current account status.
     */
    public UserAccountStatus getCurrentUserAccountStatus ()
    {
        return null;
    }

    /**
     * Gets all the fly zones within 20km of the aircraft. During simulation,
     * this method is available only when the aircraft location is within 50km of (37.460484, -122.115312).
     * Use of the geographic information provided by DJIFlyZoneManager is restricted. Refer to the DJI Developer
     * Policy sent when signing up for Mobile SDK v3.3 Beta.
     * @param callback  The execution callback with the returned execution result.
     */
    public void getFlyZonesInSurroundingAre (DJICommonCallbacks.DJICompletionCallbackWith<ArrayList<DJIFlyZoneInformation>> callback)
    {

    }

    /**
     * true if the GEO system in SDK has already opened
     * @param callback
     */
    public void getGEOSystemEnabled (DJICommonCallbacks.DJICompletionCallbackWith<Boolean> callback)
    {

    }

    /**
     * Returns the singleton of the DJIFlyZoneManager
     * @return
     */
    public static DJIFlyZoneManager getInstance ()
    {
        return null;
    }

    /**
     * Gets the unlocked fly zones of the authorized account from server.
     * The unlocked fly zones list contains the fly zones unlocked by the Flight planner and the
     * ones unlocked during the flight using any application including DJI Go as well as third party
     * DJI-SDK based application. SDK will unlock the fly zones based on the unlock records.
     * @param callback  The execution callback with the returned execution result.
     */
    public void getUnlockedNFZs (DJICommonCallbacks.DJICompletionCallbackWith<ArrayList<DJIFlyZoneInformation>> callback)
    {

    }

    /**
     * Logs out the logged in DJI user. UserAccountStatus becomes NotLoggedin.
     * @param callback
     */
    public void logoutOfDJIUserAccount (DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Sets up the FlyForbidStatusUpdateCallback for obtaining FlyForbidStatus
     * @param callback  FlyForbidStatusUpdatedCallback
     */
    public void setFlyForbidStatusUpdatedCallback (DJIFlyZoneManager.FlyForbidStatusUpdatedCallback callback)
    {

    }

    /**
     * `True` to enable GEO system. By default, if the GEO system is available at the aircraft location,
     * GEO system will be enabled. The setting is NOT settable when the aircraft is in the air.
     * The setting will take effect only when the aircraft lands.
     * When GEO system is disabled, the aircraft reverts back to the previous NFZ (No Fly Zone) system.
     * This interface may be deprecated in the future.
     * @param enabled   true to enable GEO system.
     * @param callback  The execution callback with the returned execution result.
     */
    public void setGEOSystemEnabled (Boolean enabled, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }

    /**
     * Unlocks the selected fly zones. This method could be used to unlock EnhancedWarning and Authorization.
     * After unlocking the zones, the flight in those zones will no be limited until the validation expires.
     * Also, the unlocking record will be sent to sever and shared with other DJI SDK based application.
     * @param ids       The ids of EnhancedWarningZones or AuthorizedWarningZones.
     * @param callback  The execution callback with the returned execution result.
     */
    public void unlockNFZs (ArrayList<Integer> ids, DJICommonCallbacks.DJICompletionCallback callback)
    {

    }
}

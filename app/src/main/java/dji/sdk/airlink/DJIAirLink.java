package dji.sdk.airlink;

import dji.sdk.base.DJIBaseComponent;

/**
 *
 *
 * This class contains different wireless links between the product (aircraft, handheld),
 * the remote controller (for aircraft products) and the mobile device. A product may only support
 * some of the wireless links within DJIAirLink. There are three wireless links: Lightbridge, WiFi
 * and Auxiliary. Check the corresponding querys (e.g. isWiFiLinkSupported) to determine
 * if a wireless link is supported.
 */

public class DJIAirLink
{



    /**
     * Constructor.
     * @param isLBAirLinkSupported  true if the Lightbridge Link is supported.
     * @param isWiFiLinkSupported   true if the WiFi Link is supported.
     * @param isAuxLinkSupported    true if the Auxiliary Control Link is supported.
     * @param djiWiFiLink           WiFi Link object.
     * @param airlink               Lightbridge/SDR Link object.
     * @param djiAuxLink            Auxiliary Control LInk object.
     */
    public DJIAirLink(boolean isLBAirLinkSupported, boolean isWiFiLinkSupported,
                      boolean isAuxLinkSupported, DJIWiFiLink djiWiFiLink,
                      DJIBaseComponent airlink, DJIAuxLink djiAuxLink)
    {

    }

    /**
     * Returns the Auxiliary Control Air Link object if it is available.
     * @return
     */
    public DJIAuxLink getAuxLink ()
    {
        return null;
    }

    /**
     * Returns the Lightbridge Air Link object if it is available.
     * @return
     */
    public DJILBAirLink getLBAirLink ()
    {
        return null;
    }

  //  /**
   //  * Returns the OcuSync Link object if it is available. OcuSync Link is only supported by Mavic Pro.
   //  * @return
    // */
  //  public DJIOcuSyncLink getOcuSyncLink ()
   // {
    //}

    /**
     *  Returns the WiFi Air Link object if it is available.
     * @return
     */
    public DJIWiFiLink getWiFiLink ()
    {
        return null;
    }

    /**
     *  true if the Auxiliary Control Air Link is supported. The Auxiliary Control link is the
     *  wireless link between the remote controller and aircraft for the
     *  Phantom 3 Standard and Phantom 3 4K products.
     * @return
     */
    public boolean isAuxLinkSupported ()
    {
        return false;
    }

    /**
     * true if the Lightbridge Air Link is supported.
     * @return
     */
    public boolean isLBAirLinkSupported ()
    {
        return false;
    }

    /**
     * true if the OcuSync Link is supported. OcuSync Link is only supported by Mavic Pro.
     * @return
     */
    public boolean isOcuSyncLinkSupported ()
    {
        return false;
    }

    /**
     *
     * @return
     */
    public boolean isWiFiLinkSupported ()
    {
        return false;
    }
}

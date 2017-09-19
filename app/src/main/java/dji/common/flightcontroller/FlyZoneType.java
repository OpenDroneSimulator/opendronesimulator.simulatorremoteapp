package dji.common.flightcontroller;

/**
 *
 * An enum class contains the type of the fly zone.
 */

public enum FlyZoneType
{
    Airport, ClassBAirSpace, ClassCAirSpace, ClassDAirSpace, ClassEAirSpace, CommercialAirports,
    Heliport, MilitaryZones, NOAA, NationalParks, Parcels, PowerPlants, Prisons, PrivateCommercialAirports,
    ProhibitedSpecialUse, RecreationalAirports, RestrictedSpecialUse, Schools, SpecialZones, Stadiums , TemporaryFlightRestrictions,
    Unknown , UnpavedAirport;

    public boolean _equals (int b)
    {
        return true;
    }

    public static FlyZoneType find(int value)
    {
        return null;
    }

    public int value()
    {
        return 0;
    }
}

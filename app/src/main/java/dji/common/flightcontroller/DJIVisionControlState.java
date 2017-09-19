package dji.common.flightcontroller;

/**
 *
 */

public class DJIVisionControlState
{
    private DJIVisionLandingProtectionStatus _landingProtectionState;
    private boolean _isLandingPrecisely;
    private boolean _isBraking;
    private boolean _isRoofLimitationReached;
    private boolean _isAvoidingActiveObstacleCollision;

    public DJIVisionControlState(DJIVisionLandingProtectionStatus landingProtectionState, boolean isLandingPrecisely, boolean isBraking, boolean isRoofLimitationReached, boolean isAvoidingActiveObstacleCollision)
    {
        _landingProtectionState = landingProtectionState;
        _isLandingPrecisely = isLandingPrecisely;
        _isRoofLimitationReached = isRoofLimitationReached;
        _isAvoidingActiveObstacleCollision = isAvoidingActiveObstacleCollision;
    }

    public boolean isAscentLimitedByObstacle()
    {
        return _isAvoidingActiveObstacleCollision;
    }

    public boolean	isAvoidingActiveObstacleCollision()
    {
        return _isRoofLimitationReached;
    }

    public boolean	isBraking()
    {
        return _isBraking;
    }

    public boolean	isPerformingPrecisionLanding()
    {
        return _isLandingPrecisely;
    }

    public DJIVisionLandingProtectionStatus	landingProtectionStatus()
    {
        return _landingProtectionState;
    }
}

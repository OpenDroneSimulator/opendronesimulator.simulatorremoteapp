package dji.common.airlink;

/**
 *
 */

public class SDRHdOffsetParams
{
    public int mPathLossOffset;
    public int mRcLinkOffset;
    public int mTxPowerOffset;

    public SDRHdOffsetParams(int _pathOff, int _rcOff, int _txPOff)
    {
        mPathLossOffset = _pathOff;
        mRcLinkOffset = _rcOff;
        mTxPowerOffset = _txPOff;
    }
}

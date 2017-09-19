package dji.sdk.codec;

import android.content.Context;
import android.graphics.SurfaceTexture;

/**
 *
 *
 * Class that handles encoding and decoding of media
 */

public class DJICodecManager
{
    /**
     *
     * @param context           The context.
     * @param surfaceTexture    The surface texture view.
     * @param width             The width of surface texture view.
     * @param height            The height of surface texture view.
     */
    public DJICodecManager (Context context, SurfaceTexture surfaceTexture, int width, int height)
    {

    }

    /**
     * Cleans the surface from the codec manager.
     */
    public void cleanSurface ()
    {

    }

    /**
     * Destroys the media codec.
     */
    public void destroyCodec ()
    {

    }

    public Integer getVideoHeight ()
    {
        return 0;
    }

    public Integer getVideoWidth ()
    {
        return 0;
    }

    /**
     * Sends H264 raw video data to the decoder.
     * @param videoBuffer       The video buffer data.
     * @param size              The data size.
     */
    public void sendDataToDecoder (byte[] videoBuffer, int size)
    {

    }
}

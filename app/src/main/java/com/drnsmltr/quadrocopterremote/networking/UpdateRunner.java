package com.drnsmltr.quadrocopterremote.networking;

import android.util.Log;

import com.drnsmltr.quadrocopterremote.parsing.MessageParser;
import com.drnsmltr.quadrocopterremote.virtualcontroller.Joystick;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 *
 * Used to send the flight commands in a certain interval
 */

public class UpdateRunner implements Runnable
{
    private static final String TAG = UpdateRunner.class.getSimpleName();

    boolean _running;
    String _host;
    int _port;
    Joystick _joystick;

    public UpdateRunner(boolean running, Joystick joystick, String host, int port)
    {
        _joystick = joystick;
        _running = running;
        _host = host;
        _port = port;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run()
    {
        while(_running)
        {
            MessageParser parsi = new MessageParser();
            long timeSinceLastUpdate = System.nanoTime();
            DatagramSocket toSocket;
            try {
                toSocket = new DatagramSocket();

                while(_running) {
                    if((System.nanoTime() - timeSinceLastUpdate) > 10000000) {
                        // Parse the message to be sent
                        String message = parsi.parseAsJSON(_joystick.getPitch(), _joystick.getRoll(), _joystick.getYaw(), _joystick.getThrottle());

                        byte[] data = message.getBytes();

                        try {
                            InetAddress inetAddress = InetAddress.getByName(_host);

                            DatagramPacket packet = new DatagramPacket(data, data.length, inetAddress, _port);

                            try {

                                toSocket.send(packet);

                            } catch (Exception e) {
                                Log.d(TAG, e.toString());
                            }

                            timeSinceLastUpdate = System.nanoTime();

                        } catch (Exception e) {
                            Log.d(TAG, e.toString());
                        }
                    }
                }
            }catch(Exception e)
            {
                Log.d(TAG, "Datagram Socket konnte nicht geöffnet werden: " + e.toString());
            }
        }
    }
}

package com.drnsmltr.quadrocopterremote.networking;

import android.util.Log;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 *
 * Checks the the TCP connection to the simulator and is able to check the WLAN connection
 */

public class NetworkManagerTCP
{
    private static final String TAG = NetworkManagerTCP.class.getSimpleName();


    private String _host;
    private int _port;

    /**
     * Constructor
     * @param host  host of the machine which hosts the simulator
     * @param port  port of the machine which hosts the simulator
     */
    public NetworkManagerTCP(String host, int port)
    {
        _host = host;
        _port = port;
    }

    /**
     * Tests if the port of the host and port helt by the class is available
     * Needs to be run in a new thread
     * @param timeout   waits for the given timeout: 1000 = 1 second
     * @return  true if the connection is available
     */
    public boolean testConnection(int timeout)
    {
        boolean available;

        InetSocketAddress socketAddress = new InetSocketAddress(_host, _port);

        Socket socket = new Socket();

        try {
            socket.connect(socketAddress, timeout);

            available = true;

            socket.close();

            Log.d(TAG, "Connection to the Server " + _host + ":" + _port + " successful.");

            return available;
        }catch(IOException e)
        {
            available = false;

            Log.d(TAG, "Could not connect to the Server " + _host + ":" + _port + " in the given time.", e);

            return available;

        }
    }


}

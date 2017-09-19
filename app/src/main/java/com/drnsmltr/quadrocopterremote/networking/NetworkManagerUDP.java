package com.drnsmltr.quadrocopterremote.networking;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 *
 * Used for requesting sensordata or sending flight commands
 */

public class NetworkManagerUDP
{
    private static final String TAG = NetworkManagerUDP.class.getSimpleName();

    private DatagramSocket _socket;

    String _host;
    int _port;

    public NetworkManagerUDP(String host, int port)
    {
        _host = host;
        _port = port;

        try {
            _socket = new DatagramSocket();
        } catch (Exception e) {
            Log.d(TAG, "Datagram Socket konnte nicht geöffnet werden: " + e.toString());
        }
    }

    /**
     * Sends a message to the host and port of the NetworkManagerUDP class.
     * Mostly used for sending flight commands to the simulator
     * @param msg
     * @throws Exception
     */
    public void sendMessage(final String msg) throws Exception
    {

        byte[] data = msg.getBytes();

        try {
            InetAddress inetAddress = InetAddress.getByName(_host);

            DatagramPacket packet = new DatagramPacket(data, data.length, inetAddress, _port);

            try {

                _socket.send(packet);

            } catch (Exception e) {
                Log.d(TAG, e.toString());
            }


        } catch (Exception e) {
            Log.d(TAG, e.toString());
        }

    }


    /**
     * Requests the sensordata which has been transmitted and wait for a response via TCP
     * @param code  code for the requested sensordata
     */
    public String getSensorData(String code) throws IOException
    {
        String sensorData = "";

        InetAddress serverAddr = InetAddress.getByName(_host);

        Socket socket = new Socket(serverAddr, 13001); // 13001 ist der SensorRequest Port
        socket.setSoTimeout(1000);

        try {
            //Send the message to the server
            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(code);
            bufferedWriter.flush();
            // Receive response message
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            sensorData = bufferedReader.readLine();
        }catch (IOException ioe)
        {
            socket.close();
            throw ioe;
        }finally {

            socket.close();
            return sensorData;
        }
    }

    /**
     * Returns true, if the os has a active wifi connection
     *
     * @param context
     * @return1
     */
    public static boolean hasWifiConnection(Context context)
    {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo wifiNetwork = cm.getActiveNetworkInfo();

        if (wifiNetwork != null && wifiNetwork.isConnected()) {
            return true;
        }

        return false;
    }
}

package com.drnsmltr.quadrocopterremote.networking;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Enumeration;

/**
 *
 *
 * Used for the broadcast search
 *
 * Some parts from http://michieldemey.be/blog/network-discovery-using-udp-broadcast/
 */

public class UDPNetworkDiscovery
{
    private static final String TAG = UDPNetworkDiscovery.class.getSimpleName();
    DatagramSocket _socket;

    final String REQUEST_MESSAGE = "DISCOVER_SIMULATOR_REQUEST";
    final String RESPONSE_MESSAGE = "DISCOVER_SIMULATOR_RESPONSE";


    public void search(Context parentContext, int searchPort, ArrayAdapter<String> _listItems) throws SocketTimeoutException, NullPointerException
    {

        InetAddress broadcastAddress = null;

        try {
            broadcastAddress = getBroadcastAddress(parentContext);
        }catch(IOException e)
        {
            Log.d(TAG, "Couldn't fetch the broadcastAddress: " + e.getMessage());
        }

        if(broadcastAddress != null) {
            Log.d(TAG, "Broadcast Adresse: " + broadcastAddress);
            try {
                //Open a random port to send the package
                _socket = new DatagramSocket();
                _socket.setBroadcast(true);

                byte[] sendData = REQUEST_MESSAGE.getBytes();

                //Try the 255.255.255.255 first
                try {
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, broadcastAddress, searchPort);
                    _socket.send(sendPacket);
                    System.out.println(getClass().getName() + ">>> Request packet sent to: 255.255.255.255 (DEFAULT)");
                } catch (Exception e) {
                    _socket.close();
                }

                // Broadcast the message over all the network interfaces
                Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
                while (interfaces.hasMoreElements()) {
                    NetworkInterface networkInterface = interfaces.nextElement();

                    if (networkInterface.isLoopback() || !networkInterface.isUp()) {
                        continue; // Don't want to broadcast to the loopback interface
                    }

                    for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                        InetAddress broadcast = interfaceAddress.getBroadcast();
                        if (broadcast == null) {
                            continue;
                        }

                        // Send the broadcast package!
                        try {
                            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, broadcast, searchPort);
                            _socket.send(sendPacket);
                        } catch (Exception e)
                        {
                            _socket.close();
                        }

                        System.out.println(getClass().getName() + ">>> Request packet sent to: " + broadcast.getHostAddress() + "; Interface: " + networkInterface.getDisplayName());
                    }
                }

                System.out.println(getClass().getName() + ">>> Done looping over all network interfaces. Now waiting for a reply!");




                    //Wait for a response
                    byte[] recvBuf = new byte[15000];
                    DatagramPacket receivePacket = new DatagramPacket(recvBuf, recvBuf.length);
                    try {
                        _socket.setSoTimeout(1000);
                        _socket.receive(receivePacket);

                    }catch(SocketTimeoutException e)
                    {
                        Log.d(TAG, "Fehler beim Erhalten der BroadcastSearch Nachricht " + e.toString());
                        _socket.close();
                        throw e;
                    }

                    //We have a response
                    System.out.println(getClass().getName() + ">>> Broadcast response from server: " + receivePacket.getAddress().getHostAddress());

                    //Check if the message is correct
                    String message = new String(receivePacket.getData()).trim();
                    if (message.equals(RESPONSE_MESSAGE)) {
                        _listItems.add(receivePacket.getAddress().getHostAddress().toString());
                    }

                //Close the port!
                _socket.close();
            } catch (SocketException e) {
                e.printStackTrace();
            } catch (IOException ex) {
                Log.d(TAG, "");
            }
        }else
        {
            throw new NullPointerException("Broadcast Address is null because it probably couldn't be fetched");
        }


    }


    /**
     * https://lab.dyne.org/AndroidUDPBroadcast
     *
     * @param parentContext
     * @return
     * @throws IOException
     */
    private InetAddress getBroadcastAddress(Context parentContext) throws IOException {
        WifiManager wifi = (WifiManager) parentContext.getSystemService(Context.WIFI_SERVICE);
        DhcpInfo dhcp = wifi.getDhcpInfo();

        if(dhcp == null)
        {
            return null;
        }

        int broadcast = (dhcp.ipAddress & dhcp.netmask) | ~dhcp.netmask;
        byte[] quads = new byte[4];
        for (int k = 0; k < 4; k++)
            quads[k] = (byte) ((broadcast >> k * 8) & 0xFF);
        return InetAddress.getByAddress(quads);
    }
}

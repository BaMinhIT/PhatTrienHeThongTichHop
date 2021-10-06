package tuan04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPclient {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddress = InetAddress.getByName("localhost");
        DatagramSocket datagramSocket = new DatagramSocket(3000, inetAddress);

        byte[] a = new byte[2048];

        DatagramPacket datagramPacket = new DatagramPacket(a, a.length);

        datagramSocket.receive(datagramPacket);
         String str = new String(datagramPacket.getData(), 0, a.length);
         System.out.println("server say: "+str);

    }
}

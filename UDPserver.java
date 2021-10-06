package tuan04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPserver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("localhost");
        
        String string = "xin chao, cac ban da lien ket vs server";
    
        DatagramPacket datagramPacket = new DatagramPacket(string.getBytes(), string.length(),ip , 3000);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
        System.out.println("ket thuc server");

    }


}

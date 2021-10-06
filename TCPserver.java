package tuan04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPserver {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("server da duoc tao");
        Socket socket = serverSocket.accept();

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        //doc du lieu tu client
        while(true) {
            String str = dataInputStream.readUTF();
            if(str.equals("q"))
            {
                break;
            }   
            System.out.println("Client say: "+str);

            //truyen du lieu qua client
            String truyenquaclient = scanner.nextLine();
            dataOutputStream.writeUTF(truyenquaclient);
            dataOutputStream.flush();
        }
        socket.close();
        System.out.println("server ket thuc");

    }
}

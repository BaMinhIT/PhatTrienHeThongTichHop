package tuan04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPclient {
   public static void main(String[] args) throws UnknownHostException, IOException {
       Socket socket = new Socket("127.0.0.1", 8888);
       
       DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
       DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

       Scanner scanner = new Scanner(System.in);

       while(true) {
           String str = scanner.nextLine();
           dataOutputStream.writeUTF(str); // truyen du lieu qua server
           dataOutputStream.flush();
           if(str.equals("q")) {
               break;
           }
           // doc du lieu server
           String docdulieuclient = dataInputStream.readUTF();
           System.out.println("Server say: "+docdulieuclient);
       }
       dataOutputStream.close();
       dataInputStream.close();
       socket.close();
       System.out.println("ket thuc");

   } 
}

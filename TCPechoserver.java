package TPCSocket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPechoserver {
    public static int ServerPort = 7;
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(ServerPort);
            System.out.println("Server da duoc tao");
            while(true){
                try {
                    Socket s =ss.accept();
                    OutputStream os = s.getOutputStream();
                    InputStream is = s.getInputStream(); // nhan du lieu truyen tu Server
                    int ch = 0;
                    while(true) {
                        ch= is.read();
                        if(ch==-1)
                            break;
                        System.out.println(ch);
                        os.write(ch);
                    }
                    s.close();
                } catch (Exception e) {
                    System.out.println("Conection Error"+e);
                }
            }
        } catch (Exception e) {
            System.out.println("Conection Error"+e);
        }
    }
}

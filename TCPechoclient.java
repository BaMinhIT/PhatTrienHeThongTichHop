package TPCSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCPechoclient
 */
public class TCPechoclient {
    public static String serverIP = "127.0.0.1";
    public static int ServerPort = 7;
    public static void main(String[] args) throws IOException {
        Socket s =null;
        try {
            s = new Socket(serverIP, ServerPort);
            System.out.println("Client da duoc tao");
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            for (int i = 0; i < 9; i++) {
                os.write(i);
                int ch = is.read();
                System.out.println(ch);
                Thread.sleep(1500);
            }
        } catch (Exception e) {
            System.out.println("Error:Can Not create Shocket");
        }finally {
            if (s!=null) {
                s.close();
            }
        }
    } 
    
}
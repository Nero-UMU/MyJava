package fileTrance;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class tcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);
        FileInputStream fis = new FileInputStream("amd.png");
        OutputStream os = socket.getOutputStream();
        int len = 0;
        while ((len = fis.read()) != -1){
            os.write(len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();

        len = 0;
        while ((len = is.read()) != -1){
            System.out.print(len);
        }
        os.close();
        fis.close();
        socket.close();
    }
}

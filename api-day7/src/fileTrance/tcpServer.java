package fileTrance;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class tcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("yes.png");
        int len = 0;
        while ((len = is.read()) != -1){
            fos.write(len);
        }
        OutputStream os = socket.getOutputStream();
        os.write("接收到了".getBytes(StandardCharsets.UTF_8));
        fos.close();
        ss.close();
    }
}

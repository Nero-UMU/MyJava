package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10086); //创建服务端对象，构造方法绑定端口号
        Socket socket = server.accept(); //接收来自客户端的连接
        InputStream is = socket.getInputStream(); //获取进入到服务端的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes); //读取数据
        System.out.println(new String(bytes, 0, len));
        OutputStream os = socket.getOutputStream();
        os.write("server: hello client".getBytes(StandardCharsets.UTF_8));
        socket.close();
        server.close();
    }
}

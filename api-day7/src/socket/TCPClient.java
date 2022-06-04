package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086); //创建一个客户端对象，构造方法绑定服务器的ip地址和端口号
        OutputStream os = socket.getOutputStream(); //使用Socket对象中的方法getOutputStream()方法获取网络字节输出流
        os.write("client: hello server".getBytes(StandardCharsets.UTF_8)); //使用write()方法向服务器发送数据
        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        socket.close();
    }
}

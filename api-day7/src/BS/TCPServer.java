package BS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080); //绑定端口

        while (true){
            Socket socket = server.accept(); //获取客户端发来的套接字
            new Thread(() -> {
                try {
                    InputStream is = socket.getInputStream(); //获取输入流
                    BufferedReader br = new BufferedReader(new InputStreamReader(is)); //缓冲字符
                    String line = br.readLine(); //读取请求第一行
                    String[] arr = line.split(" "); //获取请求的路径
                    String path = arr[1].substring(1);
                    System.out.println(line); //输出路径
                    FileInputStream fis = new FileInputStream(path); //输入文件
                    OutputStream os = socket.getOutputStream(); //获取网络输出流
                    os.write("HTTP/1.1 200 OK\r\n".getBytes());
                    os.write("Content-Type:text/html\r\n".getBytes());
                    os.write("\r\n".getBytes()); //请求头
                    int len = 0;
                    byte[] bytes = new byte[1024];
                    while ((len = fis.read(bytes)) != -1){
                        os.write(bytes, 0, len);
                    }
                    fis.close(); //关闭文件输入流
                    socket.close(); //关闭套接字
                } catch (IOException e){
                    e.printStackTrace();
                }
            }).start(); //开启线程
        }
    }
}

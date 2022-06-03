package buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class demo1 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos, 1024)){ //字节缓冲输出流，设置缓冲区大小，提高写入效率
            bos.write("写入到文件中去".getBytes(StandardCharsets.UTF_8));
            bos.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

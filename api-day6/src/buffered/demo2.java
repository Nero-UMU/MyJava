package buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);//字节缓冲输入流，设置缓冲区大小，提高读取效率
        int len = 0;
        while ((len = bis.read()) != -1){
            System.out.println(len);
        }
        fis.close();
    }
}

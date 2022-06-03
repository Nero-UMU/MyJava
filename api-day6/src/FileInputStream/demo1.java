package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("justTest.md"); //创建一个读取文件的对象
        System.out.println(fis.read()); //读取一个字节
        int len = 0;
        while ((len = fis.read()) != -1){
            System.out.println((char) len);
        }
        fis.close();
    }
}

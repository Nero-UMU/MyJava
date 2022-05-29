package inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = new FileInputStream("justTest.md");
        byte[] br = new byte[2]; //用来存储读取出来的字节
        int len = fis1.read(br); //len表示有效读取字节个数
        System.out.println(len);
        System.out.println(Arrays.toString(br));
        System.out.println(new String(br));

        len = fis1.read(br); //读取多个字节，并存入br中
        System.out.println(Arrays.toString(br));
        fis1.close();

        FileInputStream fis2 = new FileInputStream("justTest.md");
        byte[] bytes = new byte[1024];
        len = 0;
        while ((len = fis2.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }

    }
}

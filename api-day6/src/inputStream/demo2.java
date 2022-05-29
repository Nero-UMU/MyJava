package inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("justTest.md");
        byte[] br = new byte[2]; //用来存储读取出来的字节
        int len = fis.read(br); //len表示有效读取字节个数
        System.out.println(len);
        System.out.println(Arrays.toString(br));
        System.out.println(new String(br));

        len = fis.read(br); //读取多个字节，并存入br中
        System.out.println(Arrays.toString(br));
        fis.close();
    }
}

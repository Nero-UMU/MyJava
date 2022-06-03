package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("justTest.md");
        byte[] arr1 = {97, 48, 49, 68, 72, 100};
        fos.write(arr1); //写入一串字节

        byte[] arr2 = {'\n', 102, 78, 98, 48, 52};
        fos.write(arr2, 0, 4);

        byte[] arr3 = "\n你好世界".getBytes();
        fos.write(arr3);
        fos.close();
    }
}

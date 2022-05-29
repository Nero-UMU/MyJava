package outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("justTest.md"); //创建一个FileOutStream对象，构造方法传入写入数据的目的地
        fos.write(97); //写入字节，一次只能传入一个字节
        fos.write(98);
        fos.write(99);
        fos.write('\n');
        fos.write(100);
        fos.close(); //释放资源
    }
}

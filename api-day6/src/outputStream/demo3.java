package outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("justTest.md", true); //append设置为true，进行追加写
        for (int i = 0; i < 10; i++) {
            fos.write("goodByeWorld\n".getBytes(StandardCharsets.UTF_8));
        }
        fos.close();
    }
}

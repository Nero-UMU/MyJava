package FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyPic {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("amd.png");
        FileOutputStream fos = new FileOutputStream("yes.png");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes);
        }
        fos.close();
        fis.close();
    }
}

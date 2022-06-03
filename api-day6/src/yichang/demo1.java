package yichang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("amd.png");
             FileOutputStream fos = new FileOutputStream("yes.png")){
            int len = 0;
            while ((len = fis.read()) != -1){
                fos.write(len);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

package fileReader;

import java.io.FileReader;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("justTest.md"); //字符流读取字符
        int len = 0;
        while ((len = fr.read()) != -1){
            System.out.println((char)len);
        }
        fr.close();

    }
}

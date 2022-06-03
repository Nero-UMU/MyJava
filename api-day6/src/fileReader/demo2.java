package fileReader;

import java.io.FileReader;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("justTest.md");
        char[] ch = new char[1024];
        int len = 0;
        while ((len = fr.read(ch)) != -1){
            System.out.println(new String(ch, 0, len));
        }
        fr.close();
    }
}

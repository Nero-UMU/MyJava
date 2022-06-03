package buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr, 1024);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}

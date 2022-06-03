package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("justTest.md", true);
        fw.write("HelloWorld");
        fw.flush();
        fw.close();
    }
}

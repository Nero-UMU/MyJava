package bianma;

import java.io.*;

public class demo2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf_8.txt"), "utf-8");
        int len = 0;
        while ((len = isr.read()) != -1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}

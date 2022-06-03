package bianma;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");
        osw.write("你好世界");
        osw.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"), "gbk");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.print((char)len);
        }
        isr.close();
    }
}

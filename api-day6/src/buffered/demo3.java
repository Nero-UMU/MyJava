package buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test.txt");
        BufferedWriter bw = new BufferedWriter(fw, 1024);//创建字符缓冲输出流，设置缓冲区大小
        for (int i = 0; i < 10; i++) {
            bw.write("啊哈哈哈哈哈哈哈");
            bw.write("灭哈哈哈哈");
            bw.write("哦吼吼吼吼");
            bw.newLine(); //自动获取操作系统的换行符号
        }
        bw.flush();
        bw.close();
    }
}

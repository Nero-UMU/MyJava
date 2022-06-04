package printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("print.txt"); //创建打印流，绑定目标文件
        ps.write(97); //使用继承自父类的write方法，那么写入的时候会查询编码表
        ps.println(97); //使用自己特有的print/println方法，会原样输出
        ps.println("阿巴阿巴");
        ps.println('c');
        ps.println(3.14);
        ps.close();
    }
}

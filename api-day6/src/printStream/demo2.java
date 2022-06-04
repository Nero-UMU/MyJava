package printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("控制台输出");
        PrintStream ps = new PrintStream("目的地是打印流.txt");
        System.setOut(ps);
        System.out.println("我在打印流中输出");
        ps.close();
    }
}

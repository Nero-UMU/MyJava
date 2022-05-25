package file;

import java.io.File;

public class demo2 {
    public static void main(String[] args) {
        show1();
    }

    public static void show1(){
        File f1 = new File("/home/nero"); //File构造方法，创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
        System.out.println(f1);

        File f2 = new File(".", "demo2.md"); //File构造方法，一个父路径，一个子路径，把路径分成了两个部分
        System.out.println(f2);

        File f3 = new File(f1, "java.md"); //File构造方法，父路径是File类的对象，子路径是字符串
        System.out.println(f3);
    }
}

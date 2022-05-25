package file;

import java.io.File;
import java.io.IOException;

public class demo5 {
    public static void main(String[] args) throws IOException {
        method1();
        method2();
        method3();
    }

    public static void method1() throws IOException {
        File f1 = new File("api6.md");
        boolean b1 = f1.createNewFile(); //创建文件
        System.out.println(b1);
    }

    public static void method2(){
        File f1 = new File("api6Dir");
        boolean b1 = f1.mkdir(); //创建单级文件夹
        File f2 = new File("api6Dirs/test1/test2");
        boolean b2 = f2.mkdirs(); //创建多级文件夹
        System.out.println(b1);
        System.out.println(b2);
    }

    public static void method3(){
        File f1 = new File("api6Dir");
        boolean b1 = f1.delete(); //既能删除文件，也能删除文件夹
        System.out.println(b1);
        File f2 = new File("api6.md");
        boolean b2 = f2.delete();
        System.out.println(b2);
        File f3 = new File("api6Dirs/test1/test2"); //删除多级文件夹要写全
        boolean b3 = f3.delete();
        System.out.println(b3);
    }
}

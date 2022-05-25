package file;

import java.io.File;

public class demo4 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        File f1 = new File("justTest.md");
        System.out.println(f1.exists()); //判断文件是否存在
        File f2 = new File("dotHave.md");
        System.out.println(f2.exists());
        System.out.println(f1.isFile()); //判断路径是否以文件结尾
        System.out.println(f1.isDirectory());//判断路径是否以文件夹结尾，文件不存在isFile和isDirectory都返回false
    }
}

package directory;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        method1();
        method2();
    }
    public static void method1(){
        File f1 = new File("/etc");
        String[] arr = f1.list(); //返回目录数组
        assert arr != null;
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("=======================");
    }

    public static void method2(){
        File f1 = new File(".");
        File[] arr = f1.listFiles();
        assert arr!= null;
        for (File f : arr){
            System.out.println(f);
        }
    }
}

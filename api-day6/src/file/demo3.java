package file;

import java.io.File;

public class demo3 {
    public static void main(String[] args) {
        show1();
        show2();
        show3();
        show4();
    }

    public static void show1(){
        File f1 = new File("/home/nero/demo.txt");
        String absolute1 = f1.getAbsolutePath();
        System.out.println(absolute1);

        File f2 = new File("demo.txt");
        String absolute2 = f2.getAbsolutePath();
        System.out.println(absolute2); //不管传入的是相对路径还是决定路径，都返回绝对路径
    }

    public static void show2(){
        File f1 = new File("test.txt");
        String path1 = f1.getPath();
        System.out.println(path1);

        File f2 = new File("/home/nero/test.txt");
        String path2 = f2.getPath();
        System.out.println(path2); //将File转换为路径名称字符串
    }

    public static void show3(){
        File f1 = new File("a.txt");
        String name1 = f1.getName();
        System.out.println(name1);

        File f2 = new File("/home/nero/a.txt");
        String name2 = f2.getName();
        System.out.println(name2); //获取文件名称字符串
    }

    public static void show4(){
        File f1 = new File("justTest.md");
        String path = f1.getAbsolutePath();
        System.out.println(path);
        long l1 = f1.length();
        System.out.println(l1);
    }
}

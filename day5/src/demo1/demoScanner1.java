package demo1;

import java.util.Scanner;
/*
引用类型：
1.导包
只有java.lang下的包不需要导包
2.创建
3.使用

*/

public class demoScanner1 {
    public static void main(String[] args) {
        //System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的int数字是:" + num);

        double bot = sc.nextDouble();
        System.out.println("输入的double数字是：" + bot);

        String str = sc.next();
        System.out.println("输入的字符串是:" + str);
    }
}

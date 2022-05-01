package demo2;


import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("请输入a:");
        int a = sc.nextInt();
        System.out.printf("请输入b:");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("结果是:" + result);
    }
}

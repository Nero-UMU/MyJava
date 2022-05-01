package demo2;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("第一个数字:");
        int a = sc.nextInt();
        System.out.printf("第二个数字:");
        int b = sc.nextInt();
        System.out.printf("第三个数字:");
        int c = sc.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("the max is:" + max);
    }
}

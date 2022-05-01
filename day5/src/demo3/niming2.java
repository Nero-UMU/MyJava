package demo3;

import java.util.Scanner;

public class niming2 {
    public static void main(String[] args) {
        System.out.println("please input num1");
        int num = new Scanner(System.in).nextInt();
        System.out.println("1 the number is" + num);

//        System.out.println("please input num2");
//        methodScanner(new Scanner(System.in));

        Scanner sc = methodScanner();
        num = sc.nextInt();
        System.out.println("2 the number is" + num);
    }
    public static Scanner methodScanner(){
        return new Scanner(System.in);
    }
}

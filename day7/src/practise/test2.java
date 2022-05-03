package practise;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("please input a string:");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArr = input.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            char ch = charArr[i];
            if ('A' <= ch && ch <= 'Z'){
                countUpper++;
            }else if ('a' <= ch && ch <= 'z'){
                countLower++;
            }else if ('0' <= ch && ch <= '9'){
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母有" + countUpper);
        System.out.println("小写字母有" + countLower);
        System.out.println("数字有" + countNumber);
        System.out.println("其他的有" + countOther);
    }
}

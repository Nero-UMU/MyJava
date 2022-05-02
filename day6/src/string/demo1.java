package string;

/*
创建字符串常见3+1种方式
三种构造方法：
public String(),创建一个空白字符创，不含任何内容
public String(char[] array),根据字符数组的内容，创建对应字符串
public String(byte[] array),根据字节数组的内容，创建对应字符串
一种直接创建
 */

public class demo1 {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一个字符串" + str1);

        char[] charArr = {'A', 'B', 'C', 'D'};
        String str2 = new String(charArr);
        System.out.println("第二个字符串" + str2);

        byte[] byteArr = {65, 98, 67};
        String str3 = new String(byteArr);
        System.out.println("第三个字符串" + str3);

        String str4 = "hello";
        System.out.println("第四个字符串" + str4);
    }
}

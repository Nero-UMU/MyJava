package string;

/*
对于基本类型，==是进行数值的比较
对于引用类型，==是进行地址值的比较
 */

public class demo2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArr = {'a', 'b', 'c'};
        String str3 = new String(charArr);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }
}

package equal;

/*
public boolean equals(Object obj),只有参数是一个字符串，且内容相同的才会返回true，否则返回false
备注：任何对象都能用Object接收

public boolean equalsIgnoreCase(Object obj) 忽略大小写
 */

public class demo1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArr = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArr);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

        String str4 = "hello";
        System.out.println(str1.equals(str4));

        String strA = "Java";
        String strB = "java";
        System.out.println("严格比较大小写" + strA.equals(strB));
        System.out.println("忽略大小写" + strA.equalsIgnoreCase(strB));
    }
}

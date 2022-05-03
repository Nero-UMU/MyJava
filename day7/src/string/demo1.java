package string;

public class demo1 {
    public static void main(String[] args) {
        String str = "qrfnqriogniqrgnqrughiqbpqrubgf";
        int len = str.length(); // 获取字符串长度
        System.out.println("字符串长度为: " + len);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2); //连接字符串
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        char ch = "Hello".charAt(1);
        System.out.println("一号位的字符是" + ch);

        String original = "HelloWorld";
        int index = original.indexOf("llo"); //获取字符串第一次出现的位置
        System.out.println("第一次索引是" + index);

        System.out.println("helloworld".indexOf("abc")); //如果没有则返回-1
    }
}

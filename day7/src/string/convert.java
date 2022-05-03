package string;

public class convert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray(); //转换为字符数组
        System.out.println(chars[0]);
        System.out.println(chars.length);

        byte[] bytes = "abc".getBytes(); //转换为字节数组
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str1 = "How are you?";
        String str2 = str1.replace("o", "*"); //字符替换
        System.out.println(str1);
        System.out.println(str2);

        String lang1 = "fuck you!";
        String lang2 = lang1.replace("uc", "**");
        System.out.println(lang1);
        System.out.println(lang2);
    }
}

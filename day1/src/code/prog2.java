public class prog2 {
    public static void main (String[] args) {
        long num1 = 100;
        System.out.println(num1);//自动类型转换

        double num2 = 2.5f;
        System.out.println(num2);//自动类型转换

        int num3 = (int)100L;
        System.out.println(num3);//强制类型转换

        int num4 = (int)7000000000L;
        System.out.println(num4);

        byte num5 = 40;
        byte num6 = 50;
        int result = num5 + num6;
        System.out.println(result);

        String str1 = "java";
        System.out.println(str1 + num5 + num6);
        System.out.println(str1 + (num5 + num6));
    }
}

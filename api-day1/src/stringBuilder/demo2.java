package stringBuilder;

public class demo2 {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();

        //append方法返回的是自身
        StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);
        System.out.println(bu2);
        System.out.println(bu1==bu2);//两个对象是同一个对象

        StringBuilder bu3 = new StringBuilder();
        bu3.append(1);
        bu3.append("adf");
        bu3.append(2234.134);
        System.out.println(bu3);

        StringBuilder bu4 = new StringBuilder();
        bu4.append(1).append("42r").append(23.1);
        System.out.println(bu4);
        bu4.reverse();//反转内容
        System.out.println(bu4);
        bu4.toString();//将缓冲区内容转换为字符串
        System.out.println(bu4);
    }
}

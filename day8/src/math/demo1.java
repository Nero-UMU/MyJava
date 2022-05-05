package math;

/*
public static double abs(double num); 获取绝对值
public static double ceil(double num); 向上取整
public static double floor(double num); 向下取整
public static double long round(double num); 四舍五入
 */

public class demo1 {
    public static void main(String[] args) {
        // 绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(2.1));
        System.out.println(Math.ceil(-3.8));

        //向下取整
        System.out.println(Math.floor(3.2));
        System.out.println(Math.floor(50.44));
        System.out.println(Math.floor(2.3));

        //四舍五入
        System.out.println(Math.round(4.4));
        System.out.println(Math.round(4.5));
        System.out.println(Math.round(0.3));

        //π
        System.out.println(Math.PI);
    }
}

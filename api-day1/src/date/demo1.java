package date;

import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); //获取当前时间戳,long类型
        method1();
        method2();
        method3();
    }
    private static void method1(){
        Date date = new Date(); //无参获取当前日期
        System.out.println(date);
    }
    private static void method2(){
        Date date = new Date(0);//代参获取参数对应的时间
        System.out.println(date);
    }
    private static void method3(){
        Date date = new Date();
        long time = date.getTime();//getTime 把时间转换为毫秒
        System.out.println(time);
    }
}

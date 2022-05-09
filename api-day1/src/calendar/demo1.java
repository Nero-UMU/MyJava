package calendar;

import java.util.Calendar;
import java.util.Date;

/*
get 返回给定日历字段的值
set 设定给定的日期
add 把指定的字段增加或减少的值
getTime 返回一个表示次Calendar时间值的Date对象
 */

public class demo1 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }

    public static void method1(){
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);

        int month = c.get(Calendar.MONTH) + 1;

        int day = c.get(Calendar.DATE);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
    public static void method2(){
        Calendar c = Calendar.getInstance();
        c.set(2000, 11, 1);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
    }
    public static void method3(){
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 1);
        c.add(Calendar.MONTH, 2);
        c.add(Calendar.DATE, 3);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
    }
    public static void method4(){
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
        System.out.println(date.getTime());
    }
}

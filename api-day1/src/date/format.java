package date;

/*
String format(Date date) 按照指定模式，把Date日期格式转换符合模式的字符串
Date parse(String source) 把符合模式的字符串解析为Date日期
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class format {
    public static void main(String[] args) throws ParseException {
        method1();
        method2();
    }

    private static void method1(){
        Date date = new Date();
        //使用DateFormat类中的方法formamt把日期转换为文本，创建一个日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String time = sdf.format(date);
        System.out.println(date);
        System.out.println(time);
    }

    private static void method2() throws ParseException {
        //使用DateFormat类中的方法parse把符合构造方法的字符串解析为Date日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = sdf.parse("2022年05月09日 19时16分57秒");
        System.out.println(date);
    }
}

package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class birth {
    public static void main(String[] args) throws ParseException {
        //获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期格式为 yyyy-MM-dd");
        String birthDayString = sc.next();

        //更改格式，并转换为毫秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthTime = sdf.parse(birthDayString);
        long birth = birthTime.getTime();

        //获取当前日期，并转换为毫秒
        long today = new Date().getTime();
        long time = today - birth;
        System.out.println(time/1000/60/60/24 + "天");
    }
}

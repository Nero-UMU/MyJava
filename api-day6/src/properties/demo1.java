package properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }
    public static void method1(){
        Properties prop = new Properties();
        prop.setProperty("阿巴阿巴", "180");
        prop.setProperty("馬卡馬卡", "170");
        prop.setProperty("哈玛哈玛", "160");

        Set<String> arr = prop.stringPropertyNames();
        for (String s : arr) {
            String value = prop.getProperty(s);
            System.out.println(s + "=" + value);
        }
    }

    public static void method2(){
        Properties prop = new Properties();
        prop.setProperty("阿巴阿巴", "180");
        prop.setProperty("馬卡馬卡", "170");
        prop.setProperty("哈玛哈玛", "160");
        prop.setProperty("ShaMiKo", "150");
        prop.setProperty("MoMo", "140");
        try (FileWriter fw = new FileWriter("prop.txt")){
            prop.store(fw, "save data");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /*
    Properties 集合的load方法可以读取文件（键值对）到集合中
    void Load (InputStream inputStream) 字节输入，不能读中文
    void Load (Reader reader) 字符输入，可以读中文
     */
    public static void method3() {
        Properties prop = new Properties();
        try (FileReader fr = new FileReader("prop.txt");){
            prop.load(fr);
            Set<String> arr = prop.stringPropertyNames();
            System.out.println("=====================");
            for (String s : arr) {
                String value = prop.getProperty(s);
                System.out.println(s + "=" + value);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

package object;

import java.util.Random;

public class demo01 {
    public static void main(String[] args) {
        Person p = new Person("张三", 20);
        String s = p.toString();
        System.out.println("s: " + s);
        System.out.println("p: " + p);
        //直接打印对象等于调用对象的toString方法


        Person p1 = new Person("biabiabia", 10);
        Person p2 = new Person("biabiabia", 10);
//        p2 = p1;
//       重写equals方法后就可以比较对象的属性是否相等了
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);

        Random r = new Random();
        System.out.println(p1.equals(r));
    }
}

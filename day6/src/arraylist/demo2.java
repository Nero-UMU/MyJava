package arraylist;

import java.util.ArrayList;
/*
若需要用基本类型，则需要使用基本类型的包装类

jdk1.5开始支持自动装箱、拆箱
自动装箱，基本类型 --> 包装类型
自动拆箱，包装类型 --> 基本类型
 */

public class demo2 {
//    ArrayList<int> list = new ArrayList<int>();
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(100);
        listA.add(200);
        System.out.println(listA);

        int num = listA.get(1);
        System.out.println(num);
    }
}

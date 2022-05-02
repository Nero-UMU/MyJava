package arraylist;

import java.util.ArrayList;

/*
对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：装在集合当中的所有元素，全都是统一的类型
泛型只能是引用类型，不能是基本类型

对于ArrayList集合，直接打印的不是地址值，而是内容
*/

public class demo1 {
    public static void main(String[] args) {
        // 创建ArrayList集合，集合名称list，里面装的都是String类型的数据
        // jdk1.7开始，右边的尖括号可以不写内容
        ArrayList<String> list = new ArrayList<>();

        list.add("biubiubiu~");
        list.add("piupiupiu~");
        list.add("biabiabia~");
        System.out.println(list);
    }
}

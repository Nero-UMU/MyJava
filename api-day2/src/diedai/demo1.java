package diedai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
迭代器：
需先实例化一个迭代器
 */

public class demo1 {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        arr.add("ddd");
        Iterator<String> it = arr.iterator();//获取一个迭代器
        while (it.hasNext()){ //判断是否有元素
            System.out.println(it.next());//输出元素
        }
        System.out.println(it.hasNext());
    }
}

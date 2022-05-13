package fanxing;

/*
泛型的通配符 ?
不能在创建对象的时候使用，只能作为方法的参数使用
 */

import java.util.ArrayList;
import java.util.Iterator;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(123);
        arr.add(234);
        arr.add(345);
        printArr(arr);

        ArrayList<String> str = new ArrayList<>();
        str.add("asd");
        str.add("aht");
        str.add("hyt");
        printArr(str);
    }
    public static void printArr(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

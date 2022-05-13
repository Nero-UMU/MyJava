package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class normal {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);
        coll.add("abc");//add方法新增元素
        coll.add("def");
        coll.add("ghi");
        System.out.println(coll);
        boolean result = coll.remove("abc");//remove方法移除元素,放回布尔值
        System.out.println(result);
        System.out.println(coll);
        coll.clear();//clear方法清空元素
        System.out.println(coll);
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        System.out.println(coll);
        System.out.println(coll.contains("赵六"));//contains方法判断是否包含元素
        System.out.println(coll.isEmpty());//isEmpty判断集合是否为空
        System.out.println(coll.size());//返回集合的长度

        Object[] arr = coll.toArray();//把集合中的元素存储到数组中
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(coll);
    }
}

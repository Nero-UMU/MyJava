package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        //put把指定的值添加到map集合中，如果没有这个键，则返回null，如果有，则替换它的值，返回被替换的值
        Map<String, String> map1 = new HashMap<>();
        String v1 = map1.put("a","1");
        System.out.println(v1);
        System.out.println(map1);

        String v2 = map1.put("a", "2");
        System.out.println(v2);
        System.out.println(map1);

        map1.put("b","2");
        map1.put("c","4");
        map1.put("d","6");
        System.out.println(map1);

        //remove方法移除元素
        map1.remove("a");
        System.out.println(map1);

        //get方法获取元素
        String v3 = map1.get("c");
        String v4 = map1.get("a");
        System.out.println(v3);
        System.out.println(v4);

        //遍历map
        Set<Map.Entry<String, String>> set = map1.entrySet();
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //最常用的就是下面的利用foreach来遍历
        System.out.println("==========================");
        for (Map.Entry<String, String> map:set){
            String key = map.getKey();
            String value = map.getValue();
            System.out.println(key + "=" + value);
        }
    }
}

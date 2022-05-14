package hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("A", "d");
        System.out.println(map);//key不允许重复，无序
        Set<Map.Entry<String, String>> set = map.entrySet();
        System.out.println(set);
        for (Map.Entry<String, String> entry:set){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + value);
        }

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("A", "a");
        linked.put("B", "b");
        linked.put("C", "c");
        linked.put("A", "d");
        System.out.println(linked);//key不允许重复，有序
    }
}

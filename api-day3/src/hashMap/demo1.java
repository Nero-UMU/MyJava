package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        method1();
        method2();
    }
    public static void method1(){
        //创建hashmap集合
        HashMap<String, Person> map = new HashMap<>();
        map.put("上海", new Person("Jack", 25));
        map.put("北京", new Person("Alice", 23));
        map.put("广州", new Person("Lily", 12));
        map.put("南京", new Person("Brown", 20));
        Set<String> set = map.keySet();
        for (String key:set){
            Person value = map.get(key);
            System.out.println(key + "-->" +value);
        }
    }
    public static void method2(){
        HashMap <Person, String> map = new HashMap<>();
        map.put(new Person("mm", 10),"mia~");
        map.put(new Person("bb", 10),"bia~");
        map.put(new Person("kk", 10),"kia~");
        map.put(new Person("mm", 10),"fia~");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry:set){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" +value);
        }
    }
}

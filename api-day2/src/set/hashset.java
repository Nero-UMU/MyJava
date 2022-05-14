package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("apple");
        list.add("orange");
        list.add("pear");
        Iterator<String> arr = list.iterator();
        while (arr.hasNext()){
            System.out.println(arr.next());
        }
        System.out.println("abc".hashCode());
        System.out.println("def".hashCode());
        System.out.println("ghi".hashCode());
    }
}

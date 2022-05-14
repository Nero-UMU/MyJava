package mapTest;

import java.util.HashMap;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a String:");
        String str = sc.next();

        HashMap<Character, Integer> mapList = new HashMap<>();
        for (char c:str.toCharArray()){
            if (mapList.containsKey(c)){
                Integer value = mapList.get(c);
                value++;
                mapList.put(c, value);
            }else {
                mapList.put(c,1);
            }
        }
        for (Character key:mapList.keySet()){
            Integer value = mapList.get(key);
            System.out.println(key + "=" + value);
        }
    }
}

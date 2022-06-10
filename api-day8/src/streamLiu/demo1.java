package streamLiu;

import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abandon");
        list.add("fuck me");
        list.add("what the fuck");
        list.add("hello world");
        list.add("nya");
        list.add("fuck");

        list.stream()
                .filter(str -> str.startsWith("f"))
                .filter(str -> str.length()>5)
                .forEach(str -> System.out.println(str));
    }
}

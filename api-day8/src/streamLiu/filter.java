package streamLiu;

import java.util.ArrayList;
import java.util.stream.Stream;

public class filter {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("w t f");
        str.add("fuck me");
        str.add("what the hell");
        str.add("surprise mother fucker");
        Stream<String> stream = str.stream();
        stream.filter((name) -> {return name.startsWith("w");}).forEach(System.out::println);
//        stream.forEach((name)->{
//            System.out.println(name);
//        });
        //stream流只能用一次
    }
}

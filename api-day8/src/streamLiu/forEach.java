package streamLiu;

import java.util.stream.Stream;

public class forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("aaa", "bbb", "ccc", "ddd");
        stream.forEach((name)-> {
            System.out.println("str:" + name);
        });
    }
}

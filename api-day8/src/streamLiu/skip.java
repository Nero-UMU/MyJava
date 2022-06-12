package streamLiu;

import java.util.stream.Stream;

public class skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("草", "靠", "可恶", "我去");
        Stream<String> stream1 = stream.skip(2);
        stream1.forEach(System.out::println);
    }
}

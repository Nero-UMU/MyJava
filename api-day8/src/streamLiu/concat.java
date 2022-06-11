package streamLiu;

import java.util.stream.Stream;

public class concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("阿巴阿巴", "外币巴布", "不拉布拉");
        Stream<String> stream2 = Stream.of("hello", "world", "gdi", "btw");
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach((name)->{
            System.out.println(name);
        });
    }
}

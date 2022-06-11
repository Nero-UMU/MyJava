package streamLiu;

import java.util.stream.Stream;

public class map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        Stream<Integer> stream1 = stream.map(Integer::parseInt);
        stream1.forEach((num)-> System.out.println(num));
    }
}

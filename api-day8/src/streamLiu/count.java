package streamLiu;

import java.util.ArrayList;
import java.util.stream.Stream;

public class count {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        long count = stream.count();
        System.out.println(count);
    }
}

package streamLiu;

import java.util.Arrays;
import java.util.stream.Stream;

public class limit {
    public static void main(String[] args) {
        String[] arr = new String[]{"hello", "world", "cao", "wlg"};
        Stream<String> stream = Arrays.stream(arr);
        Stream<String> stream1 = stream.limit(3);
        stream1.forEach(System.out::println);
    }
}

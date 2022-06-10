package functionalInterface;

import java.util.function.Function;

public class function1 {
    public static int method(String str, Function<String, Integer> fun){
        return fun.apply(str);
    }

    public static void main(String[] args) {
        String str = "123456";
        int result = method(str, (s)->{
            return Integer.parseInt(s + 100);
        });
        System.out.println(result);
    }
}

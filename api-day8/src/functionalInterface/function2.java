package functionalInterface;

import java.util.function.Function;

public class function2 {
    public static void change(String str, Function<String, Integer> fun1, Function<Integer, String> fun2){
        String ss = fun1.andThen(fun2).apply(str);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String str = "12345678";
        change(str, (s)->{
            return Integer.parseInt(s) + 10;
        },(i)->{
            return i + "";
        });
    }
}

package functionalInterface;

import java.util.function.Predicate;

public class predicate2 {
    public static boolean method(String str, Predicate<String> pre1, Predicate<String> pre2){
        return pre1.or(pre2).test(str);
    }

    public static void main(String[] args) {
        String str = "fuck";
        boolean b = method(str, (String pre1)->{
            return pre1.length()>5;
        },(String pre2)->{
            return pre2.contains("u");
        });
        System.out.println(b);
    }
}

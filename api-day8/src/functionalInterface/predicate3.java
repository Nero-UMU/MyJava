package functionalInterface;

import java.util.function.Predicate;

public class predicate3 {
    public static boolean method(String str, Predicate<String> pre){
//        return !pre.test(str);
        return pre.negate().test(str);
    }

    public static void main(String[] args) {
        String s = "abandon";
        boolean b = method(s, (str)->{
            return str.length()>5;
        });
        System.out.println(b);
    }
}

package functionalInterface;

import java.util.function.Predicate;

public class predicate {
    public static boolean check(String str, Predicate<String> pre){
        return pre.test(str);
    }

    public static void main(String[] args) {
        String str1 = "abc";
        boolean b =check(str1,(str)->{
            return str.length()>5;
        });
        System.out.println(b);
    }
}

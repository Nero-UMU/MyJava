package functionalInterface;

import java.util.function.Predicate;

public class predicate1 {
    public static boolean method(String str, Predicate<String> pre1, Predicate<String> pre2){
//        return pre1.test(str) && pre2.test(str);
        return pre1.and(pre1).test(str);
    }

    public static void main(String[] args) {
        String s = "abandon";
        boolean b = method(s, (str)->{
            return str.length()>5;
        },(str)->{
            return str.contains("a");
        });
        System.out.println(b);
    }
}

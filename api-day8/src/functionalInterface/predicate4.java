package functionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class predicate4 {
    public static ArrayList<String> method(String[] arr, Predicate<String> pre1, Predicate<String> pre2){
        ArrayList<String> result = new ArrayList<>();
        for (String str : arr) {
            if (pre1.and(pre2).test(str)){
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"gua,18", "kuang,20", "bilibala,15", "gacha,17","mumuzi,14", "alohaya,20"};
        ArrayList<String> result = method(arr, (str)->{
            return str.split(",")[0].length()>4;
        },(str)->{
            return Integer.parseInt(str.split(",")[1]) > 16;
        });
        System.out.println(result);
    }
}

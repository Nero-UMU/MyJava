package functionalInterface;

import java.util.function.Consumer;

public class consumer1 {
    public static void method(String[] arr, Consumer<String> con1, Consumer<String> con2){
        for (String message : arr) {
//            con1.andThen(con2).accept(message);
            con1.accept(message);
            con2.accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"buang,18", "kuang,20", "muang,17"};
        method(arr,
                (mess)->{
                    System.out.print("姓名: " + mess.split(",")[0]);
                },
                (mess)->{
                    System.out.println("年龄: " + mess.split(",")[1]);
                }
        );
    }
}

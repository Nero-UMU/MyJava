package functionalInterface;

import java.util.function.Consumer;

public class consumer {
    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

    public static void main(String[] args) {
        method("fuck me",(String str)->{
            System.out.println("I say: "+ str);
        });
    }
}

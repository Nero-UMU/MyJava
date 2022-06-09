package functionalInterface;

import java.util.Locale;
import java.util.function.Consumer;

public class andThen {
    public static void method(String str, Consumer<String> con1, Consumer<String> con2){
//        con1.accept(str);
//        con2.accept(str);
        con1.andThen(con2).accept(str);
    }

    public static void main(String[] args) {
        method("HelloWorld",
                (t)-> {System.out.println(t.toLowerCase());},
                (t)-> {System.out.println(t.toUpperCase());}
        );
    }
}

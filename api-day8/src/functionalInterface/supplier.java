package functionalInterface;

import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        String str = getString(()->{
            return "haha";
        });
        System.out.println(str);
    }
    public static String getString(Supplier<String> sup){ //supplier方法用来生产一个数据
        return sup.get();
    }
}

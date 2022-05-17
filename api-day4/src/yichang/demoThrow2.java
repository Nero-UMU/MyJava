package yichang;

import java.util.Objects;

public class demoThrow2 {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){
//        if (obj == null){
//            throw new NullPointerException("传递的对象是空的");
//        }
//        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "传递的对象是空的");
        //简化代码书写方式
    }
}

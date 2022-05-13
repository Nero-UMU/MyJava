package fanxing;

/*
定义含有泛型的方法
格式
修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
}
 */

public class generic2 {
    public <M> void method1(M m){
        System.out.println(m);
    }

    public static <S> void method2(S s){
        System.out.println(s);
    }
}

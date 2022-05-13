package fanxing;

/*
含有泛型的接口
使用方法
1.定义接口的实现类，指定接口的泛型
2.接口使用什么泛型，实现类就使用什么泛型，类跟着接口走，相当与定义了一个含有泛型的类，创建对象的时候确定泛型的类型
 */

public class demo3 {
    public static void main(String[] args) {
        generic3class1<String> gc3 = new generic3class1<>();
        gc3.method1("~bia~");

        generic3class2 gc4 = new generic3class2();
        gc4.method1("~pia~");
    }
}

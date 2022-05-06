package jiekou;

/*
接口定义
public class 实现类名称 implements 接口名称{
}
接口使用步骤
接口不能直接使用，必须先实现类来实现该接口
接口必须覆盖重写（实现）接口中所有的抽象方法
创建实现类的对象，进行使用

如果实现类没覆盖重写所有的抽象方法，否则自己必须是抽象类
 */

public class demo1 {
    public static void main(String[] args) {
        myInterfaceImpl impl = new myInterfaceImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}

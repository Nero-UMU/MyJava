package jiekouDefault;

public class demo2 implements myInterfaceDefault{
    @Override
    public void myMethod() {
        System.out.println("实现了抽象方法，BBB");
    }
    @Override
    public void myMethod1(){
        System.out.println("实现了b覆盖重写默认方法");
    }
}

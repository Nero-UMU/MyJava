package niMingNeiBuLei;

/*
如果是接口的实现类(或是父类的子类)只需要使用唯一的一次
那么这种情况就可以省略该类的定义，改为使用匿名内部类

匿名内部类格式
接口名称 对象名 = new 接口名称(){
    // 覆盖重写所有抽象方法
}
1.new 代表创建对象的动作
2.接口名称就是内名内部类需要实现哪个接口
3.大括号内才是匿名内部类的内容

匿名内部类，在创建对象的时候，只能使用唯一一次
如果想要多次创建对象，而且内容一样，那么就需要单独定义一个实现类
匿名内部类是省略了实现类或子类，匿名对象是省略了对象名称

这样就可以在使用接口的时候不用特意定义一个接口的实现类
 */

public class demoMain {
    public static void main(String[] args) {
//        myInterface obj = new myInterfaceImpl();
//        obj.method();
        myInterface obj = new myInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类方法");
            }
        };
        obj.method();
    }
}

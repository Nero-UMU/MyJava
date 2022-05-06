package duojiekou;

/*
接口没有静态代码块和构造方法
一个类的父类是唯一的，但接口可以有多个
如果实现类有多个接口中，存在重复的抽象方法，那么只需要覆写一次就可以了
如果实现类没有覆盖重写所有接口的所有抽象方法，那么实现类必须是一个抽象类
如果多个接口中存在重复的默认方法，那么实现类必须覆盖重写默认方法
如果父类中的方法和接口中的默认方法产生冲突，优先用父类中的方法
 */

public class demo implements myInterfaceA,myInterfaceB{

    @Override
    public void methodA() {
        System.out.println("AAA");
    }

    @Override
    public void abs() {
        System.out.println("abstract");
    }

    @Override
    public void method() {

    }

    @Override
    public void methodB() {
        System.out.println("BBB");
    }
}

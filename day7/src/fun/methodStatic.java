package fun;

/*
一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，是属于类的
如果没有static关键字，那么必须先创建对象，再通过对象使用它

无论是成员变量还是成员方法，如果使用了static，都推荐使用类名称调用

静态方法可以访问静态变量，但不能直接访问非静态变量，反过来可以
静态方法不能使用this
 */

public class methodStatic {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();

        obj.methodStatic();//正确，但不推荐
        MyClass.methodStatic(); //推荐用法，直接使用类名称.静态方法

        myMethod();
        methodStatic.myMethod(); //等价于上面的
    }
    public static void myMethod(){
        System.out.println("my method");
    }
}

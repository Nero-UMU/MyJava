package gouzao;

/*
构造方法格式：
public 类名称(参数类型 参数名称){
}
构造方法不能返回
如果没有构造方法，编译器会白送一个空的构造方法
一旦编写至少一个构造方法，则不送了
构造方法也是可以重载的
*/

public class student {
    int age;
    String name;
    public student(){
        System.out.println("默认无参构造方法执行了!");
    }
    public student(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("全参构造方法执行了!");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void show(){
        System.out.println("I am " + this.name + this.age + " age");
    }
}

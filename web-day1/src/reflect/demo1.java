package reflect;

import domain.Person;

/*
获取Class对象方法
Class.forName("全类名")
类名.class
对象.getClass()
 */
public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //全类名
        Class<?> cls1 = Class.forName("domain.Person");
        System.out.println(cls1);
        //类名.class
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);
        //对象.getClass()
        Person p = new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);
        //同一个字节码文件在一次程序运行中，只加载一次，不论通过哪种方法，都是同一个
    }
}

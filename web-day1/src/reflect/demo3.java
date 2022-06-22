package reflect;

import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class demo3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        //获取构造方法
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);//有参构造
        System.out.println(constructor);

        //构造方法可以用来创建对象
        Person p = constructor.newInstance("张三", 18);
        System.out.println(p);

        Constructor<Person> constructor1 = personClass.getConstructor();//无参构造
        Person p1 = constructor1.newInstance();
        System.out.println(p1);
    }
}

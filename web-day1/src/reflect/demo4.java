package reflect;

import domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method eat = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法，无参的
        eat.invoke(p);

        //执行方法，有参的
        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(p, "饭");

        System.out.println("=========================");
        //获取所有方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
//            System.out.println(method);
            String name = method.getName();//获取名称
            System.out.println(name);
        }

        System.out.println("============================");
        //获取类名
        String name = personClass.getName();
        System.out.println(name);
    }
}

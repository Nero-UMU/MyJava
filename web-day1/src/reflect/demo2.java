package reflect;

import domain.Person;

import java.lang.reflect.Field;

public class demo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        //获取所有用 public 修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("===============");
        //获取单个成员变量
        Field a = personClass.getField("a");
        Person p = new Person();
        p.a="10";

        //获取对象的a这个变量的值
        Object value = a.get(p);
        System.out.println(value);
        System.out.println("====================");
        //修改对象的a这个变量的值
        a.set(p,"张三");
        System.out.println(p);

        System.out.println("====================");

        //获取所有的成员变量，不论用什么修饰，破坏了封装性
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }
}

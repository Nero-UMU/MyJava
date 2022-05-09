package object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

//    @Override
//    public boolean equals(Object obj) {
//        //如果是自己，则直接方法
//        if (obj == this){
//            return true;
//        }
//
//        //增加判断是否是Person类型
//        if (obj instanceof Person){
//            Person change = (Person) obj;
//            if (this.name.equals(change.name) && age == change.age){
//                return true;
//            }else {
//                return false;
//            }
//        }else {
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

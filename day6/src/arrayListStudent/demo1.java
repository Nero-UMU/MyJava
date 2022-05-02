package arrayListStudent;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("biu", 10);
        Student two = new Student("piu", 20);
        Student three = new Student("bia", 30);
        Student four = new Student("pia", 40);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("name is:" + stu.getName() + ", age is:" + stu.getAge());
        }
    }
}

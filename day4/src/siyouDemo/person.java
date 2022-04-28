package siyouDemo;

public class person {
    public static void main(String[] args) {
        student stu = new student();
        stu.setName("盖茨");
        stu.setAge(80);
        stu.setMale(true);

        System.out.println("姓名: " + stu.getName());
        System.out.println("年龄: " + stu.getAge());
        System.out.println("是不是男的: " + stu.isMale());
    }
}

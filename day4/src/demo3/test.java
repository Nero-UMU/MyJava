package demo3;

public class test {
    public static void main(String[] args) {
        student stu1 = new student();
        stu1.setName("玛卡巴卡");
        stu1.setAge(20);
        System.out.println("name:" + stu1.getName() + " age:" + stu1.getAge());
        System.out.println("=====================");

        student stu2 = new student("无息地西", 30);
        System.out.println("name:" + stu2.getName() + " age:" + stu1.getAge());
    }
}

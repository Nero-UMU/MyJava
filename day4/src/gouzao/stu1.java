package gouzao;

public class stu1 {
    public static void main(String[] args) {
        student jack = new student();
        student alice = new student("alice", 20);
        alice.show();
        alice.setAge(++alice.age);
        alice.show();
    }
}

//若要改变成员变量的内容，仍然需要set方法

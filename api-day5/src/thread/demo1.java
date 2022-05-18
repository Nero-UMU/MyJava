package thread;

public class demo1 {
    //单线程程序
    public static void main(String[] args) {
        Person p1 = new Person("A");
        Person p2 = new Person("B");

        p1.printName();
        p2.printName();
    }
}

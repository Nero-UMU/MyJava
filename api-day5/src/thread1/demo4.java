package thread1;

public class demo4 {
    public static void main(String[] args) {
        setName mt = new setName();
        mt.setName("biang");

        setName mt1 = new setName("bia");
        mt1.start();
        mt.start();
    }
}

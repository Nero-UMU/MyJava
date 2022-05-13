package fanxing;

public class demo2 {
    public static void main(String[] args) {
        generic2 gc = new generic2();
        gc.method1(10);
        gc.method1("haha");
        gc.method1(true);
        gc.method1(0.8);

        generic2.method2("sdf");
        generic2.method2(true);
    }
}

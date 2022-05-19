package thread;

public class demo3 {
    public static void main(String[] args) {
        myThread mt = new myThread();
        mt.start();
//        new myThread().start();
//        new myThread().start();
//        new myThread().start();
        myThread mt1 = new myThread();
        mt1.start();
        System.out.println(Thread.currentThread().getName());//获取主线程名称
    }
}

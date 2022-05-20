package thread2;

/*
创建多线程的第二种方法
步骤：
1.创建Runnable接口的实现类
2.重现接口的run方法
3.创建实现类对象
4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
5.调用Thread类中的start方法，开启新的线程执行run方法
 */

public class demo1 {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread th = new Thread(run);
        th.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

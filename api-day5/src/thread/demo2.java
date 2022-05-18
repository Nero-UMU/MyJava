package thread;

/*
创建多线程方法一：创建Thread类的子类
步骤：
    1.创建一个 Thread 子类
    2.在Thread类的子类中重写Thread的run方法，设置线程任务
    3.创建Thread子类对象
    4.调用Thread类中的start方法，开启新的线程执行run方法
 */

public class demo2 {
    public static void main(String[] args) {
        myThread mt = new myThread();
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("润:" + i);
        }
    }
}

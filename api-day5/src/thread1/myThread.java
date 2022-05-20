package thread1;

/*
获取进程方法调用getName()方法，返回字符串
currentThread()方法，返回当前正在执行的进程对象的引用，这个对象也可以调用getName()方法
 */

public class myThread extends Thread{
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
        Thread name1 = currentThread();
        System.out.println(name1);

    }
}

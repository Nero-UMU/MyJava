package lock;

/*
Lock锁解决线程安全，比synchronized更好用
Lock接口的方法:
void lock()获取锁
void unlock()释放锁

步骤
在成员位置创建一个ReentrantLock对象
在可能出现安全问题的代码前调用Lock接口的lock方法
在可能出现安全问题的代码后调用Lock接口的unlock方法

结合finally更安全
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable{
    private int ticket = 100;
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        l.lock();
        while (true){
            if (ticket>0){
                try {
                    Thread.sleep(10);//为了增加产生问题的概率，加了睡眠时间
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"张票");
                ticket--;
            }else break;
        }
        l.unlock();
    }

}

package tongbudaimakuai;

/*
同步代码块解决线程问题
格式
synchronized(锁对象){
可能出现线程安全的代码
}
原理，抢夺到了同步块的执行，会把锁对象拿走，然后执行同步代码块，执行完了就释放锁对象
其他线程执行到此处发现没有锁对象，没有执行权，会一直等待锁对象归还
 */

public class RunnableImpl implements Runnable{
    private int ticket = 100;

    Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (ticket>0){
                    try {
                        Thread.sleep(10);//为了增加产生问题的概率，加了睡眠时间
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"张票");
                    ticket--;
                }
            }
        }
    }

}

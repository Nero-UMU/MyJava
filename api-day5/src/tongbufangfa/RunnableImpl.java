package tongbufangfa;

/*
同步方法，就是把方法内部的代码锁住，锁对象是线程的实现类对象，也就是this
 */

public class RunnableImpl implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        System.out.println("this:"+this);
        while (ticket>0){
            payTicket();
        }
    }

    public synchronized void payTicket(){
        if (ticket>0){
            try {
                Thread.sleep(10);//为了增加产生问题的概率，加了睡眠时间
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread()+"正在卖"+ticket+"张票");
            ticket--;
        }
    }
}

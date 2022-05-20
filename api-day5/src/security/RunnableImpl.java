package security;

/*
线程安全问题，重复或不存在的票被售卖
 */

public class RunnableImpl implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while (true){
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

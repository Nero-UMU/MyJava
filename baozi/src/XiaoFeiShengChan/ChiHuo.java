package XiaoFeiShengChan;

public class ChiHuo extends Thread{
    private BaoZi baozi;
    public ChiHuo(BaoZi bz){
        this.baozi=bz;
    }
    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if (!baozi.flag){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒后
                System.out.println("吃货正在吃" + baozi.pi + baozi.xian + "的包子");
                System.out.println("吃包子需要3s");
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baozi.flag=false;
                //唤醒包子铺
                baozi.notify();
                System.out.println("吃货已经吃掉了" + baozi.pi + baozi.xian + "的包子");
                System.out.println("==============================");
            }
        }
    }
}

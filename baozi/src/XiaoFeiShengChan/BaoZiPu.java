package XiaoFeiShengChan;

public class BaoZiPu extends Thread{
    private final BaoZi baozi;
    private int count = 0;
    public BaoZiPu(BaoZi bz){
        this.baozi = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if (baozi.flag){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒后
                if (count % 2==0){
                    baozi.pi="薄皮";
                    baozi.xian="三鲜";
                }
                else {
                    baozi.pi="冰皮";
                    baozi.xian="牛肉";
                }
                count++;
                System.out.println("包子铺正在生产:" + baozi.pi + baozi.xian + "包子");
                System.out.println("生产包子需要3s");
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baozi.flag=true;
                baozi.notify();
                System.out.println("包子铺已经生产好了" + baozi.pi + baozi.xian + "包子，可以吃了");
            }
        }
    }
}

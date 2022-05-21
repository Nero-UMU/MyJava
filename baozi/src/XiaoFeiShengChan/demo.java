package XiaoFeiShengChan;

public class demo {
    public static void main(String[] args) {
        BaoZi baozi = new BaoZi();
        new BaoZiPu(baozi).start();
        new ChiHuo(baozi).start();
    }
}

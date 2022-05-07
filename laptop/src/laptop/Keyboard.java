package laptop;

public class Keyboard implements USB {
    @Override
    public void powerOn() {
        System.out.println("键盘开机");
    }

    @Override
    public void powerOff() {
        System.out.println("键盘关机");
    }

    public void type() {
        System.out.println("啪嗒啪嗒");
    }

    @Override
    public void tranceData() {
        System.out.println("1010101101010101010101");
    }
}

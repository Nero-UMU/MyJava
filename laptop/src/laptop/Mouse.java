package laptop;

public class Mouse implements USB{
    @Override
    public void powerOn() {
        System.out.println("鼠标开机");
    }

    @Override
    public void powerOff() {
        System.out.println("鼠标关机");
    }

    public void click(){
        System.out.println("Click Click");
    }

    @Override
    public void tranceData() {
        System.out.println("1111111111111111111111");
    }
}

package laptop;

public class Computer {
    public void open(){
        System.out.println("电脑关机!");
    }
    public void close(){
        System.out.println("电脑关机!");
    }

    public void useDevice(USB usb){
        usb.tranceData();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
    }
}

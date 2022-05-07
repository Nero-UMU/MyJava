package laptop;

public class demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();
        USB mouse = new Mouse();
        computer.useDevice(mouse);

        USB keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.close();
    }
}

package laptop;

public interface USB {
    public abstract void powerOn();
    public abstract void powerOff();

    public default void tranceData(){
        System.out.println("0000000000000000000000");
    }
}

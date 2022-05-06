package duojiekou;

public interface myInterfaceB {
    public abstract void methodB();
    public abstract void abs();

    public default void method(){
        System.out.println("接口B的默认");
    }
}

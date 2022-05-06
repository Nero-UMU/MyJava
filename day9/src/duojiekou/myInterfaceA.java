package duojiekou;

public interface myInterfaceA {
    public abstract void methodA();
    public abstract void abs();

    public default void method(){
        System.out.println("接口A的默认");
    }
}

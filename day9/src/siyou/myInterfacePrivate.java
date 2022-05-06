package siyou;

public interface myInterfacePrivate {
    public default void method1(){
        System.out.println("默认方法1");
        play();
    }
    public default void method2(){
        System.out.println("默认方法2");
        play();
    }
    private void play(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}

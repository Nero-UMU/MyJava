package jingtaiInterface;

public interface myInterface {
    public static void method1(){
        System.out.println("默认方法1");
        play();
    }
    public static void method2(){
        System.out.println("默认方法2");
        play();
    }
    private static void play() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}


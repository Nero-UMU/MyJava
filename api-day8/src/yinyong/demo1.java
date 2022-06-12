package yinyong;

public class demo1 {
    public static void method(PrintStr p){
        p.print("hello world");
    }

    public static void main(String[] args) {
        method((a)->{
            System.out.println(a);
        });
    }
}

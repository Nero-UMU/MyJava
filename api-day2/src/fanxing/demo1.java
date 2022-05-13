package fanxing;

public class demo1 {
    public static void main(String[] args) {
        generic1 gc1 = new generic1();
        gc1.setName("啊哈哈哈");
        Object obj = gc1.getName();
        System.out.println(obj);

        generic1<Integer> gc2 = new generic1<>();
        gc2.setName(10);
        Integer num = gc2.getName();
        System.out.println(num);

        generic1<String> gc3 = new generic1<>();
        gc3.setName("A String");
        String str = gc3.getName();
        System.out.println(str);

    }
}

package phone;

public class demo1 {
    public static void main(String[] args) {
        xiaomi one = new xiaomi();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("==================");

        one.brand = "苹果";
        one.price = 8848.0;
        one.color = "black";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("===================");

        one.call("乔布斯");
        one.sendMessage();
    }
}

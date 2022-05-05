package phone;

public class demo1 {
    public static void main(String[] args) {
        phone one = new phone();
        one.call();
        one.send();
        one.show();

        System.out.println("=============");
        newPhone two = new newPhone();
        two.call();
        two.send();
        two.show();
    }
}

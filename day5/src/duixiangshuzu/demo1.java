package duixiangshuzu;


public class demo1 {
    public static void main(String[] args) {
        person[] arr = new person[3];

        person one = new person("aaa", 10);
        person two = new person("bbb", 20);
        person three = new person("ccc", 30);

        arr[0] = one;
        arr[1] = two;
        arr[2] = three;
        System.out.println(arr[0].getName());
        System.out.println(arr[1].getName());
        System.out.println(arr[2].getName());
    }
}

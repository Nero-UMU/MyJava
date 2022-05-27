package digui;

public class demo1 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(sum(100));
    }

    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}

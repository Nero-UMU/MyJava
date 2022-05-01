package suiji;

import java.util.Random;

public class demo3 {
    public static void main(String[] args) {
        int n = 10;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }
    }
}

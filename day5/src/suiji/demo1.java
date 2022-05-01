package suiji;

import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        Random ran = new Random();
        int num = ran.nextInt();
        System.out.println("随机数是:" + num);
    }
}

package suiji;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入你猜测的数字:");
            int gusetNum = sc.nextInt();
            if(gusetNum > randomNum){
                System.out.println("太大了，请重试");
            }else if(gusetNum < randomNum){
                System.out.println("太小了，请重试");
            }else{
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
        System.out.println("game over!");
    }
}

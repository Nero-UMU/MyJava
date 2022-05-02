package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class demo3 {
    public static void main(String[] args) {
        int num;
        Random ran = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            num = ran.nextInt(33) + 1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

package redbag;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends User{
    public Manager(int money, String name){
        this.setName(name);
        this.setMoney(money);
    }
    @Override
    public void showMoney() {
        System.out.println("我是" + this.getName() + "， 我有" + this.getMoney() + "元");
    }

    public ArrayList<Integer> send(int money, int device){
        ArrayList<Integer> moneyArr = new ArrayList<>();
        if (money <= this.getMoney()) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < device - 1; i++) {
                arr.add(money / device);
                money -= money / device;
            }
            arr.add(money / device + money % device);
            for (int i = 0; i < device; i++) {
                Random num = new Random();
                int place = num.nextInt(device - i);
                moneyArr.add(arr.remove(place));
            }
            this.setMoney(this.getMoney() - money);
        } else {
            moneyArr.add(0);
            return moneyArr;
        }
        return moneyArr;
    }
}

package redbag;

import java.util.ArrayList;

public class Member extends User{
    public Member(int money, String name){
        this.setMoney(money);
        this.setName(name);
    }
    @Override
    public void showMoney() {
        System.out.println("我是" + this.getName() + "， 我有" + this.getMoney() + "元");
    }

    public void getMoney(ArrayList<Integer> moneyArr){
        int money = moneyArr.remove(0);
        this.setMoney(this.getMoney() + money);
    }
    public void sayRedBag(){
        System.out.println(this.getName() + ":" + "群主要么发红包，要么女装!");
    }
}

package redbag;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        Manager first = new Manager(200, "群主");
        Member one = new Member(30, "群员1");
        Member two = new Member(80, "群员2");
        Member three = new Member(60, "群员3");
        Member four = new Member(50, "群员4");
        Member five = new Member(70, "群员5");

        first.showMoney();
        one.showMoney();
        two.showMoney();
        three.showMoney();
        four.showMoney();
        five.showMoney();
        System.out.println("=======================");

        one.sayRedBag();
        two.sayRedBag();
        three.sayRedBag();
        four.sayRedBag();
        five.sayRedBag();

        ArrayList<Integer> moneyList = first.send(100, 5);
        if (moneyList.get(0) == 0){
            System.out.println("群主:没钱!拿女装来!");
        }else {
            System.out.println("群主:fuck");
            one.getMoney(moneyList);
            two.getMoney(moneyList);
            three.getMoney(moneyList);
            four.getMoney(moneyList);
            five.getMoney(moneyList);

            System.out.println("=======================");
            first.showMoney();
            one.showMoney();
            two.showMoney();
            three.showMoney();
            four.showMoney();
            five.showMoney();
        }
    }
}

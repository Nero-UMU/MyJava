package chongming;

/*
局部变量 直接写成员变量名
本类的成员变量 this.成员变量名
父类的成员变量 super.成员变量名
 */

public class zi extends fu{
    int num = 20;
    public void method(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}

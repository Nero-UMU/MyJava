package test1;

/*
直接通过对象名称访问成员变量，等号左边是谁，优先用谁，没有则向上找
间接访问成员方法访问成员变量，看方法属于是，优先用谁，没有则向上找
 */

public class demo1 {
    public static void main(String[] args) {
        fu obj = new zi();
        System.out.println(obj.num);

        obj.show();
    }
}

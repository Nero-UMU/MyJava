package contruct;

/*
继承关系中
1.子类构造方法中默认含"super()"调用，所有先调用父类的构造方法，再子类构造方法
2.子类构造可以通过super关键字来调用父类的重载构造方法
3.super的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造

子类必须调用父类构造方法，不写则赠送super(),写了则用指定的super调用，super只能有一个，而且必须是第一个
 */

public class demo1 {
    public static void main(String[] args) {
        child one = new child();
    }
}

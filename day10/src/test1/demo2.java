package test1;

/*
编译看左边，运行看右边
 */

public class demo2 {
    public static void main(String[] args) {
        fu obj = new zi();
        //obj是父类的东西，但是是由子类new出来的，obj可以使用父类的方法，子类重写了才会在子类中实现，父类中没有的，子类中定义的，obj会找不到

        obj.method(); //父子都有，优先用子
        obj.methodFu(); //子类没有，向上找，使用父类的
    }
}

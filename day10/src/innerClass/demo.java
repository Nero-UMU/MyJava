package innerClass;

/*
内部类：一个类内部包含另一个类

分类：
1.成员内部类
2.局部内部类

成员内部类格式：
修饰符 class 外部类名称{
    修饰符 class 内部类名称{
    }
}

内部类用外部类随意访问，外用内，需要内部类对象

使用成员内部类方法
1.间接方法，在外部类的方法中，使用内部类，然后只调用外部类的方法
2.直接方法
外部类名称.内部类名称 对象名称 = new 外部类名称().new 内部类名称();

如果内外部重名了，内部类使用外部类的方法是 外部类名称.this.外部类成员变量名
 */

public class demo {
    public static void main(String[] args) {
        body b = new body();
        b.methodBody();

        body.Heart heart = new body("阿巴阿巴阿巴").new Heart();
        heart.beat();
    }
}

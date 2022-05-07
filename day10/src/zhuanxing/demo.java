package zhuanxing;

/*
向上转型，就是多态的写法
格式
父类名称 对象名 = new 子类名称();
创建一个子类对象，把它当做父类来看待使用
向上转型一定是安全的

向下转型，其实是一个还原的动作
格式
子类名称 对象名 = (子类名称) 父类对象;

类似于数据类型的强制类型转换
 */

public class demo {
    public static void main(String[] args) {
        animal a = new cat();
        // 创建一个猫的子类对象，把它当做动物来看待
        a.eat();

        /*a.catchMouse(); //错误，并不是所有动物都会抓老鼠
        解决方案，用对象的向下转型还原*/

        cat mao = (cat) a;
        mao.catchMouse();
    }
}

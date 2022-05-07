package multi;

/*
多态性：父类引用指向子类对象

父类名称 对象名 = new 子类名称();
接口名称 对象名 = new 实现类名称();
 */

public class demo1 {
    public static void main(String[] args) {
        father obj = new child();

        obj.method();
        obj.fu();
    }
}

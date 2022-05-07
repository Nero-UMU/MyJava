package zhuanxing;

/*
如何知道父类引用的对象，本来是什么子类
格式
对象 instanceof 类名称
 */

public class demo2 {
    public static void main(String[] args) {
        animal mao = new cat();
        mao.eat();

        if (mao instanceof dog){
            dog gou = (dog) mao;
            gou.look();
        }
        if (mao instanceof cat){
            cat mao1 = (cat) mao;
            mao1.catchMouse();
        }

    }
}

package zhuanxing;

public class cat extends animal {

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    //子类特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

package test1;

public class zi extends fu{
    int num = 20;

    @Override
    public void show() {
        System.out.println(num);
    }

    @Override
    public void method() {
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }
}

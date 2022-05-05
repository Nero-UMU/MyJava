package chouxiang;

public class cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    @Override
    public void walk(){
        System.out.println("猫四条腿走路");
    }
}

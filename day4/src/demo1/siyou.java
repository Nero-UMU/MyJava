package demo1;

public class siyou {
    String name;
    private int age;

    public void show(){
        System.out.println("I am " + name + ", age " + getAge());
    }
    public void setAge(int num){
        if (num < 100 && num >= 0) {
            age = num;
        } else {
            System.out.println("error");
        }
    }
    public int getAge(){
        return age;
    }
}

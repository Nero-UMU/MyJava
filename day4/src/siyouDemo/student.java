package siyouDemo;

public class student {
    private String name;
    private int age;
    private boolean male;

    public void setMale(boolean sex){
        male = sex;
    }
    public boolean isMale(){
        return male;
    }

    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }
}
//布尔型的get方法一定要设置为isxxx这样的
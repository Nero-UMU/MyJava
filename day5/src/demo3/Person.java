package demo3;

public class Person {
    String name;
    public Person(String str){
        this.name = str;
    }
    public void show(){
        System.out.println("I am " + this.name);
    }
}

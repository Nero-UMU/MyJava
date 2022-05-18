package thread;

public class Person {
    private String name;

    public void printName(){
        for (int i = 0; i < 20; i++) {
            System.out.println(this.name + "-->" + (i + 1));
        }
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}

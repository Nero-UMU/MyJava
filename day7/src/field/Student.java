package field;

public class Student {
    private String name;
    private int age;
    private int id;
    static String room;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    private static int idCounter = 0; //学号自增

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }
}

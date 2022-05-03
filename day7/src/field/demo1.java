package field;

public class demo1 {
    public static void main(String[] args) {
        Student one = new Student("biang", 19);
        one.room = "2333号";
        System.out.println("姓名:" + one.getName() + " 年龄:" + one.getAge() + "教室:" + one.room + "学号" + one.getId());
        Student two = new Student("buang", 20);
        System.out.println("姓名:" + two.getName() + " 年龄:" + two.getAge() + "教室:" + two.room + "学号" + two.getId());
    }
}

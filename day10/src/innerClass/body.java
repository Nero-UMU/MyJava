package innerClass;

public class body { //外部类
    public class Heart{ //内部类
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫" + name);
        }
    }

    public body() {
    }

    public body(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类的方法");
        Heart heart = new Heart();
        heart.beat();
    }
}

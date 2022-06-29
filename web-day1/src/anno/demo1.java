package anno;

@SuppressWarnings("all") //压制警告
public class demo1 {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated //提示版本过时
    public void show1(){
        System.out.println("有缺陷");
    }

    public void show2(){
        System.out.println("可以用");
    }

    @MyAnno
    public void demo(){
        show1();
    }
}

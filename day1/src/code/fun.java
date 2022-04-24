public class fun {
    public static void main(String[] args){
        System.out.println("农民：");
        farmer();
        System.out.println("商贩：");
        seller();
        System.out.println("厨师：");
        cook();
        System.out.println("我：");
        me();
    }
    public static void farmer(){
        System.out.println("种植");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给商贩");
    }
    public static void seller(){
        System.out.println("运到农贸市场");
        System.out.println("抬价");
        System.out.println("吆喝");
        System.out.println("卖给厨师");
    }
    public static void cook(){
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }
    public static void me(){
        System.out.println("吃");
    }
}

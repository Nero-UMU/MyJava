package codeStatic;

public class demo1 {
    static {
        System.out.println("静态代码块执行！ ");
    }
    public static void person(){
        System.out.println("普通代码执行");
    }
}

/*
首次用到本类时，静态代码块执行唯一一次
静态代码块典型用途：用来一次性对静态成员变量进行赋值
 */
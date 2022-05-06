package jiekouchangliang;

/*
接口中也可以定义“成员变量”，但是必须使用 public static final三个关键字修饰

格式
public static final 数据类型 常量名称 = 数据值;
一旦使用final关键字修饰，说明不可改变
接口中的常量，可以省略 public static final，不写也是一样的
接口中的常量必须赋值，不能不赋值
 */

public interface myInterface {
    public static final int NUM = 20;
}

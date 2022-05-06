package jiekouDefault;

/*
java8开始接口允许定义默认方法
格式
public default 返回值类型 方法名称(参数列表){
}

用以解决接口升级的问题
 */

public interface myInterfaceDefault {
    public abstract void myMethod();

    public default void myMethod1(){
        System.out.println("新添加的默认方法");
    }
}

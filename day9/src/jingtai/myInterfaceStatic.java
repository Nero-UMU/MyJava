package jingtai;

/*
java8开始，接口中允许定义静态方法

格式
public static 返回值类型 方法名称(参数列表){
}
就是把abstract或者default换成static
和静态方法的用法一样直接接口名称调用
 */

public interface myInterfaceStatic {
    public static void methodStatic(){
        System.out.println("接口静态方法");
    }
}

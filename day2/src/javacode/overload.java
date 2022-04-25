//overload重载
//方法名称一样，但参数列表不同

package javacode;

public class overload {
    public static void main(String[] args) {
        System.out.println(sum(10,20, 30, 40));
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
    public static int sum(double a, double b){
        return (int)(a + b);
    }
}

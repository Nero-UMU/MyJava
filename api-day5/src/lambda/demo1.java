package lambda;

/*
Lambda表达式
格式:
(参数列表) -> {一些重写方法的代码};
(): 接口找那个抽象方法的参数列表，没有参数就空着，有参数就写出参数，多个参数使用逗号分隔
->: 传递的意思，把参数传递给方法体{}
{}: 重写接口的抽象方法的方法体
 */

public class demo1 {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(Thread.currentThread().getName() + "新线程创建了")).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();
    }
}

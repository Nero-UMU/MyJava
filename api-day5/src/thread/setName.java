package thread;

/*
两种命名进程方法
 */

public class setName extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public setName(String name){
        super(name);
    }
    public setName(){

    }
}

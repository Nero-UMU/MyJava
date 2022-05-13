package fanxing;

/*
定义含有泛型的类
格式如下，就是在类的名称后面加一个<E>，把数据的类型换成E就可以了
 */

public class generic1<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
    public void method(){
        System.out.println(name);
    }
}

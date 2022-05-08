package jubuneibulei;

/*
如果一个类是定义在方法内部的，那么这是一个局部内部类
“局部”：只有当前所属的方法才能使用它，出了这个方法就不能用了
格式：
修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称(参数列表){
        class 局部内部类名称{
        }
    }
}
就是一个方法里面定义了一个类，方便在这个方法内使用，别的地方都不能使用这个类
 */

public class Outer {
    public void methodOuter(){
        class inner{
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        inner in = new inner();
        in.methodInner();
    }
}

package override;

/*
方法覆盖注意
1.父子类之间方法的名称相同，参数列表也相同
2.子类方法的返回值必须小于等于父类的方法的返回范围
3.子类方法的权限必须大于等于父类方法的权限修饰符
public > protected > (default) > private
(default)不是关键字default，是什么都不写，留空
 */

public class child extends father{
    @Override //重写标识写不写都可以
    public void method(){

    }
}

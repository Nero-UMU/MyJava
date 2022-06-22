package test;

import junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before //修饰的方法会在测试方法之前被自动执行
    public void init(){
        System.out.println("init...");
    }
    @After//修饰的方法会在测试方法之后被自动执行
    public void close(){
        System.out.println("end...");
    }
    @Test
    public void testAdd(){
//        System.out.println("运行了");
        Calculator c = new Calculator();
        int result = c.add(1, 2);
//        System.out.println(result);
        //断言
        Assert.assertEquals(3,result);//对比期望的结果和实际的结果
    }
    @Test
    public void testSub(){
        Calculator c = new Calculator();
        int result = c.sub(3, 4);
        Assert.assertEquals(-1, result);
    }
}

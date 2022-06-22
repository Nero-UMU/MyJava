package test;

import junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
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

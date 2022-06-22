package junit;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result = c.add(3,5);
        System.out.println(result);
        int sub = c.sub(4, 1);
        System.out.println(sub);
    }
}

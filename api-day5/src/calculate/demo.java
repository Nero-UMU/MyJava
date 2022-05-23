package calculate;

public class demo {
    public static void main(String[] args) {
        invokeCalc(10, 20, new calc() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        });

        invokeCalc(20, 20 , (int a, int b)->{
            return a + b;
        });
    }

    public static void invokeCalc(int a, int b, calc c){
        int ans = c.sum(a,b);
        System.out.println(ans);
    }
}

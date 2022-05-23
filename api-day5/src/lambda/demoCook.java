package lambda;

public class demoCook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("恰饭了");
            }
        });

        invokeCook(()->{
            System.out.println("吃饭了");
        });

        invokeCook(()-> System.out.println("开吃"));
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}

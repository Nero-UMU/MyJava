package thread2;

public class nimingneibulei {
    public static void main(String[] args) {
        Runnable r =  new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("1.hello");
                }
            }
        };
        new Thread(r).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("2.world");
                }
            }
        }).start();
    }
}

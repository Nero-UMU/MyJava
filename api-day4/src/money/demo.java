package money;

public class demo {
    public static void main(String[] args) {
        checkAccount c = new checkAccount(1000);
        System.out.println("Depositing $1000...");
        c.deposit(500);
        try {
            System.out.println("withdraw $100...");
            c.withdraw(100);
            System.out.println("withdraw $1200...");
            c.withdraw(1200);
        } catch (myException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}

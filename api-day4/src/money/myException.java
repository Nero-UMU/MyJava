package money;

public class myException extends Exception{
    private int amount;

    public myException(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

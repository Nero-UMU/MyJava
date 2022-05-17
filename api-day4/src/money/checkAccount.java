package money;

public class checkAccount {
    private int balance;
    private int number;

    public checkAccount(int number){
        this.number=number;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount) throws myException {
        if (amount<=balance){
            balance-=amount;
        }else {
            int need = amount-balance;
            throw new myException(need);
        }
    }

    public int getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
}

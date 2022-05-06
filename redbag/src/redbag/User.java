package redbag;

public abstract class User {
    private int money;
    private String name;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    public User(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public abstract void showMoney();
}

package _java.unidad6.clases;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this(id, name, 0);
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        this.balance += amount;
        return balance;
    }

    public boolean debit(int amount) {
        boolean can = false;
        if (this.balance > amount) {
            this.balance -= amount;
            can = true;
        }

        return can;
    }

    public boolean transferTo(Account account, int amount) {
        boolean canTrans = this.debit(amount);
        if (canTrans)
            account.credit(amount);
        return canTrans;
    }

    @Override
    public String toString() {
        return "Account[" + "id=" + id + ", name=" + name + ", balance=" + balance + ']';
    }
}

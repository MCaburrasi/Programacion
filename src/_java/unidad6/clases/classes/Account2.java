package _java.unidad6.clases.classes;

public class Account2{

    //Atributos miembro
    private int accountNumber;
    private double balance;
    private String name;

    //Atributos de clase
    private static int numAccounts = 0;

    //Constructores
    public Account2(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        numAccounts++;
    }

    public Account2(int accountNumber, String name) {
        this(accountNumber,name,0.0);
    }

    //getters y setters
    public static int getNumAccounts() {
        return numAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("A/C no=%d, name=%s, balance=$%.2f", accountNumber, name, balance);
    }

    public void credit(double ammount){
        balance += ammount;
    }

    public boolean debit(double ammount){
        boolean op = false;
        if (ammount <= balance){
            balance -= ammount;
            op = true;
        }
        return op;
    }

    public void close(){
        name += " CLOSED";
        balance = 0;
        numAccounts--;
    }

    public static Account2 consolidate (Account2 account1, Account2 account2){
        Account2 account3 = null;
        if (account1.name.equals(account2.name) && account1.accountNumber != account2.accountNumber) {
            account3 = new Account2(0, account1.name, account1.balance + account2.balance);
            account1.close();
            account2.close();
        }
        return account3;
    }

    public boolean transfer(Account2 account, int amount) {
        boolean canTrans = debit(amount);
        if (canTrans)
            account.credit(amount);
        return canTrans;
    }

    public static boolean transfer(Account2 account1, Account2 account2, int amount) {
        return account1.transfer(account2, amount);
    }
}
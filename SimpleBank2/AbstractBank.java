package SimpleBank2;

public abstract class AbstractBank implements Account {
    protected double balance;

    @Override
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    @Override
    public abstract void deposit(double amount);

    @Override
    public abstract void withdraw(double amount);
}

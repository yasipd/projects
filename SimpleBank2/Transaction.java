package SimpleBank2;

public class Transaction implements Runnable {
    private Bank bank;
    private double amount;
    private boolean deposit;

    public Transaction(Bank bank, double amount, boolean deposit) {
        this.bank = bank;
        this.amount = amount;
        this.deposit = deposit;
    }

    @Override
    public void run() {
        if (deposit) {
            bank.deposit(amount);
        } else {
            bank.withdraw(amount);
        }
    }
}

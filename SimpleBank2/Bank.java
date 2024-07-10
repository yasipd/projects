package SimpleBank2;

public class Bank extends AbstractBank {

    public Bank() {
        this.balance = 0;
    }

    @Override
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount should be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

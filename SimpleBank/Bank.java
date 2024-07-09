package SimpleBank;

public class Bank {
    private double balance = 0;


    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println("Successfully deposited: " + amount);       
        }else {
            System.out.println("Deposit amount should be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -=amount;
            System.out.println("Successfully withdrew: " + amount);
        }else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
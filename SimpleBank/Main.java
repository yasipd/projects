package SimpleBank;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Bank myBank=new Bank();
        Scanner sc=new Scanner(System.in);
        while (true) { 
            System.out.println("Enter the option you want: \n 1: Balance \n 2: Deposit \n 3: Withdraw \n 4: Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1 :
                    myBank.displayBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount=sc.nextDouble();
                    myBank.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawAmount=sc.nextDouble();
                    myBank.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong option, try again.");
                    break;
            }
        }
    }
    
}

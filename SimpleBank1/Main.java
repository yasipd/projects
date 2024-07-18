package SimpleBank1;

import java.util.Scanner;

public class Main {
    private static BankingSystem bankingSystem = new BankingSystem();
    private static User currentUser;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeUsers();
        while (true) {
            showMainMenu();
        }
    }

    private static void initializeUsers() {
        bankingSystem.addUser(new User("user1", "password1"));
        bankingSystem.addUser(new VIPUser("vipuser", "password2"));
    }

    private static void showMainMenu() {
        System.out.println("\n=== Banking System ===");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        System.out.print("Select an option: ");
        int choice = Integer.parseInt(scanner.nextLine().trim());

        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private static void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();
        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();

        currentUser = bankingSystem.getUser(username);
        if (currentUser != null && currentUser.checkPassword(password)) {
            System.out.println("Login successful!");
            showBankingInterface();
        } else {
            System.out.println("Login failed: Invalid username or password.");
        }
    }

    private static void showBankingInterface() {
        while (true) {
            System.out.println("\n=== Banking Interface ===");
            System.out.println("1. Display Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            if (currentUser instanceof VIPUser) {
                System.out.println("4. View Special Benefits");
                System.out.println("5. Calculate Interest");
                System.out.println("6. Logout");
            } else {
                System.out.println("4. Logout");
            }
            System.out.print("Select an option: ");
            int choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1:
                    currentUser.getAccount().displayBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine().trim());
                    bankingSystem.performTransaction(currentUser, depositAmount, true);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine().trim());
                    bankingSystem.performTransaction(currentUser, withdrawAmount, false);
                    break;
                case 4:
                    if (currentUser instanceof VIPUser) {
                        ((VIPUser) currentUser).getSpecialBenefits();
                    } else {
                        return;
                    }
                    break;
                case 5:
                    if (currentUser instanceof VIPUser) {
                        double interest = ((VIPUser) currentUser).calculateInterest();
                        System.out.println("Calculated interest: " + interest);
                    } else {
                        System.out.println("Invalid option. Please try again.");
                    }
                    break;
                case 6:
                    if (currentUser instanceof VIPUser) {
                        return;
                    } else {
                        System.out.println("Invalid option. Please try again.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

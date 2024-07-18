package Project;


import java.util.Scanner;

public class Main {
    private static BankingSystem bankingSystem = new BankingSystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeUsers();
        showUsers(); // Display all users at the start
        while (true) {
            showMainMenu();
        }
    }

    private static void initializeUsers() {
        bankingSystem.addUser(new User("user1", "password1"));
        bankingSystem.addUser(new VIPUser("vipuser", "password2"));
    }

    private static void showUsers() {
        System.out.println("\n=== Registered Users ===");
        bankingSystem.displayUsers(user -> true); // Display all users
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

        User user = bankingSystem.getUser(username);
        if (user != null && user.checkPassword(password)) {
            showBankingInterface(user);
        } else {
            System.out.println("Login failed: Invalid username or password.");
        }
    }

    private static void showBankingInterface(User user) {
        while (true) {
            System.out.println("\n=== Banking Interface ===");
            System.out.println("1. Display Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            if (user instanceof VIPUser) {
                System.out.println("4. View Special Benefits");
                System.out.println("5. Logout");
            } else {
                System.out.println("4. Logout");
            }
            System.out.print("Select an option: ");
            int choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1:
                    user.getAccount().displayBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine().trim());
                    bankingSystem.performTransaction(user, depositAmount, true);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine().trim());
                    bankingSystem.performTransaction(user, withdrawAmount, false);
                    break;
                case 4:
                    if (user instanceof VIPUser) {
                        ((VIPUser) user).getSpecialBenefits();
                    } else {
                        return;
                    }
                    break;
                case 5:
                    if (user instanceof VIPUser) {
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

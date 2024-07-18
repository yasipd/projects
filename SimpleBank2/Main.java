package SimpleBank2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static BankingSystem bankingSystem = new BankingSystem();
    private static User currentUser;

    public static void main(String[] args) {
        initializeUsers();
        showLoginGUI();
    }

    private static void initializeUsers() {
        bankingSystem.addUser(new User("user1", "password1"));
        bankingSystem.addUser(new VIPUser("vipuser", "password2"));
    }

    private static void showLoginGUI() {
        JFrame frame = new JFrame("Banking System - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeLoginComponents(panel);

        frame.setVisible(true);
    }

    private static void placeLoginComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JLabel statusLabel = new JLabel("");
        statusLabel.setBounds(10, 110, 300, 25);
        panel.add(statusLabel);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());
                currentUser = bankingSystem.getUser(username);

                if (currentUser != null && currentUser.checkPassword(password)) {
                    statusLabel.setText("Login successful!");
                    showBankingInterface();
                    ((JFrame) SwingUtilities.getWindowAncestor(panel)).dispose();
                } else {
                    statusLabel.setText("Login failed: Invalid username or password.");
                }
            }
        });
    }

    private static void showBankingInterface() {
        JFrame frame = new JFrame("Banking System - Main");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeBankingComponents(panel);

        frame.setVisible(true);
    }

    private static void placeBankingComponents(JPanel panel) {
        panel.setLayout(null);

        JButton displayBalanceButton = new JButton("Display Balance");
        displayBalanceButton.setBounds(10, 20, 150, 25);
        panel.add(displayBalanceButton);

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(10, 50, 150, 25);
        panel.add(depositButton);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(10, 80, 150, 25);
        panel.add(withdrawButton);

        JLabel statusLabel = new JLabel("");
        statusLabel.setBounds(10, 110, 300, 25);
        panel.add(statusLabel);

        displayBalanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Current balance: " + currentUser.getAccount().getBalance());
            }
        });

        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String amountStr = JOptionPane.showInputDialog("Enter amount to deposit:");
                double amount = Double.parseDouble(amountStr);
                bankingSystem.performTransaction(currentUser, amount, true);
                statusLabel.setText("Deposited: " + amount);
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String amountStr = JOptionPane.showInputDialog("Enter amount to withdraw:");
                double amount = Double.parseDouble(amountStr);
                bankingSystem.performTransaction(currentUser, amount, false);
                statusLabel.setText("Withdrew: " + amount);
            }
        });

        if (currentUser instanceof VIPUser) {
            JButton viewBenefitsButton = new JButton("View Special Benefits");
            viewBenefitsButton.setBounds(10, 140, 150, 25);
            panel.add(viewBenefitsButton);

            JButton calculateInterestButton = new JButton("Calculate Interest");
            calculateInterestButton.setBounds(10, 170, 150, 25);
            panel.add(calculateInterestButton);

            viewBenefitsButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ((VIPUser) currentUser).getSpecialBenefits();
                    statusLabel.setText("Special benefits displayed in console.");
                }
            });

            calculateInterestButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double interest = ((VIPUser) currentUser).calculateInterest();
                    statusLabel.setText("Calculated interest: " + interest);
                }
            });
        }

        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(10, 200, 150, 25);
        panel.add(logoutButton);

        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentUser = null;
                ((JFrame) SwingUtilities.getWindowAncestor(panel)).dispose();
                showLoginGUI();
            }
        });
    }
}

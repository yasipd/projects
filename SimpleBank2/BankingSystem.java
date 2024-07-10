package SimpleBank2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class BankingSystem {
    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public void displayUsers(Predicate<User> predicate) {
        users.values().stream().filter(predicate).forEach(user -> System.out.println(user.getUsername()));
    }

    public void performTransaction(User user, double amount, boolean deposit) {
        Transaction transaction = new Transaction(user.getAccount(), amount, deposit);
        Thread transactionThread = new Thread(transaction);
        transactionThread.start();
    }
}

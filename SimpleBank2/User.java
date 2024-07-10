package SimpleBank2;

public class User {
    private String username;
    private String password;
    private Account account;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.account = new Bank(); // Assign a Bank account to the user
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public Account getAccount() {
        return account;
    }
}

package Project;

public class User {
    private String username;
    private String password;
    private Bank account;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.account = new Bank();
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public Bank getAccount() {
        return account;
    }
}


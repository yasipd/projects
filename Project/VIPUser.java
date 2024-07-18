package Project;

public class VIPUser extends User {
    private static final double INTEREST_RATE = 0.05;

    public VIPUser(String username, String password) {
        super(username, password);
    }

    public void getSpecialBenefits() {
        System.out.println("As a VIP user, you have special benefits! Enjoy!");
    }

//    public double calculateInterest() {
//        return getAccount().getBalance() * INTEREST_RATE;
//    }
}

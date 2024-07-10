package SimpleBank2;

public class VIPUser extends User {
    public VIPUser(String username, String password) {
        super(username, password);
    }

    public void getSpecialBenefits() {
        System.out.println("As a VIP user you have special benefits! Enjoy!");
    }
}

 class AccountValidator {
    public static void main(String[] args) {
        double balance = -50.25;

        if (balance > 100.0) {
            System.out.println("Account status: Healthy");
        } else if (balance >= 0.0) {
            System.out.println("Account status: Low Balance Warning");
        } else {
            System.out.println("Account status: Overdrawn");
        }
    }
}

 class AccountTransaction {
    public static void main(String[] args) {
        double balance = 500.00;
        double withdrawalAmount = 200.00;
        boolean cardIsActive = true;
        boolean pinIsValid = true;

        if (!cardIsActive) {
            System.out.println("Transaction Rejected: Card is disabled.");
        } else if (!pinIsValid) {
            System.out.println("Transaction Rejected: Invalid PIN code.");
        } else {
            if (withdrawalAmount <= 0) {
                System.out.println("Transaction Rejected: Amount must be positive.");
            } else if (withdrawalAmount > balance) {
                System.out.println("Transaction Rejected: Insufficient available funds.");
            } else {
                balance -= withdrawalAmount;
                System.out.println("Transaction Success! Remaining balance: $" + balance);
            }
        }
    }
}

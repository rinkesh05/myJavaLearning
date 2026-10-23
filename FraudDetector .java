 class FraudDetector {
    public static void main(String[] args) {
        double transactionAmount = 4500.00;
        String ipCountry = "US";
        String cardCountry = "UK";
        boolean proxyDetected = false;
        int failedAttempts = 2;

        if (failedAttempts >= 3 || proxyDetected) {
            System.out.println("Status: Transaction Blocked (High Risk Risk)");
        } else {
            if (!ipCountry.equals(cardCountry)) {
                if (transactionAmount > 2000.00) {
                    System.out.println("Status: Mismatch & High Value. Hold for Manual Review.");
                } else {
                    System.out.println("Status: Flagged for verification link step.");
                }
            } else {
                if (transactionAmount > 10000.00) {
                    System.out.println("Status: Hold for Corporate Fraud Approval.");
                } else {
                    System.out.println("Status: Approved.");
                }
            }
        }
    }
}

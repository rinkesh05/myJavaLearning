 class TaxCalculator {
    public static void main(String[] args) {
        double income = 95000.0;
        String residencyStatus = "Resident";
        double taxOwed = 0.0;

        if (residencyStatus.equals("Non-Resident")) {
            taxOwed = income * 0.30;
        } else if (residencyStatus.equals("Resident")) {
            if (income <= 20000) {
                taxOwed = income * 0.10;
            } else if (income <= 80000) {
                taxOwed = (20000 * 0.10) + ((income - 20000) * 0.20);
            } else {
                taxOwed = (20000 * 0.10) + (60000 * 0.20) + ((income - 80000) * 0.35);
            }
        }

        if (taxOwed > 0.0 || income == 0.0) {
            System.out.println("Total tax liability: $" + taxOwed);
        } else {
            System.out.println("Invalid status or income.");
        }
    }
}

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();

    void showReceipt() {
        System.out.println("Amount Paid: $" + amount);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    void processPayment() {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class TestPayment {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment(250.00, "1234-5678-9876");
        payment.processPayment();
        payment.showReceipt();
    }
}

class Payment {
    void pay(double amount) {
        System.out.println("Processing generic payment of $" + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

public class TestPayment {
    public static void main(String[] args) {
        Payment p = new CreditCardPayment();
        p.pay(150.75); 
    }
}

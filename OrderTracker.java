public class OrderTracker {
    public static void main(String[] args) {
        char statusCode = 'S';

        switch (statusCode) {
            case 'P':
                System.out.println("Order is Pending.");
                break;
            case 'S':
                System.out.println("Order has Shipped.");
                break;
            case 'D':
                System.out.println("Order is Delivered.");
                break;
            default:
                System.out.println("Unknown order status.");
                break;
        }
    }
}

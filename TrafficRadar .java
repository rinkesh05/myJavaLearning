class TrafficRadar {
    public static void main(String[] args) {
        int currentSpeed = 75;

        if (currentSpeed > 60) {
            System.out.println("Speed limit exceeded! Fine issued.");
        } else {
            System.out.println("Speed is within the safe limit.");
        }
    }
}

 class TrafficSignal {
    public static void main(String[] args) {
        String lightColor = "Yellow";

        switch (lightColor) {
            case "Red":
                System.out.println("Stop immediately.");
                break;
            case "Yellow":
                System.out.println("Prepare to stop.");
                break;
            case "Green":
                System.out.println("Go safely.");
                break;
            default:
                System.out.println("Signal malfunctioning.");
                break;
        }
    }
}

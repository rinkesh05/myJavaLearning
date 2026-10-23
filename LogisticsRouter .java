 class LogisticsRouter {
    public static void main(String[] args) {
        double weightKg = 12.5;
        double volumeCbr = 0.45;
        String zone = "International";
        boolean requiresColdChain = false;

        if (weightKg <= 0 || volumeCbr <= 0) {
            System.out.println("Routing Failure: Dimensions must be greater than zero.");
        } else if (requiresColdChain) {
            System.out.println("Assigned Route: Specialised Refrigerated Fleet Cargo.");
        } else {
            if (zone.equals("Domestic")) {
                if (weightKg <= 5.0 && volumeCbr <= 0.1) {
                    System.out.println("Assigned Route: Standard Ground Courier Courier.");
                } else {
                    System.out.println("Assigned Route: Domestic Heavy Freight Trucking.");
                }
            } else if (zone.equals("International")) {
                if (weightKg <= 20.0 && volumeCbr <= 0.5) {
                    System.out.println("Assigned Route: Express Air Cargo.");
                } else {
                    System.out.println("Assigned Route: Maritime Container Shipping.");
                }
            } else {
                System.out.println("Routing Failure: Geography zone not covered by system.");
            }
        }
    }
}

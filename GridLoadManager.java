public class GridLoadManager {
    public static void main(String[] args) {
        double currentDemandMw = 420.5;
        double reserveCapacityMw = 50.0;
        int gridFrequencyHz = 49;
        boolean alternateSourceAvailable = false;

        if (gridFrequencyHz < 48 || gridFrequencyHz > 52) {
            System.out.println("System Action: Emergency Shutdown initiated to prevent grid failure.");
        } else {
            if (currentDemandMw > (400.0 + reserveCapacityMw)) {
                if (alternateSourceAvailable) {
                    System.out.println("System Action: Main power deficient. Routing alternate grid supply.");
                } else {
                    System.out.println("System Action: Severe overload risk. Commencing targeted rolling blackouts.");
                }
            } else if (gridFrequencyHz == 49 || gridFrequencyHz == 51) {
                System.out.println("System Action: Frequency anomaly detected. Adjusting generator throttling.");
            } else {
                System.out.println("System Action: Operation nominal. Supply balances current demand.");
            }
        }
    }
}

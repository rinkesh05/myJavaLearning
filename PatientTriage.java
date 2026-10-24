public class PatientTriage {
    public static void main(String[] args) {
        int heartRateBpm = 115;
        int oxygenSatPct = 88;
        double bodyTempC = 39.2;

        if (oxygenSatPct < 85 || heartRateBpm > 140 || heartRateBpm < 40) {
            System.out.println("Triage Level: Red Alert! Dispatch immediate critical care team.");
        } else {
            if (oxygenSatPct >= 85 && oxygenSatPct <= 92) {
                if (bodyTempC > 38.5) {
                    System.out.println("Triage Level: Yellow Alert. Oxygen low with high fever. Monitor closely.");
                } else {
                    System.out.println("Triage Level: Yellow Alert. Supplementary oxygen required.");
                }
            } else {
                if (bodyTempC > 38.0 || heartRateBpm > 100) {
                    System.out.println("Triage Level: Green Alert. Elevated vitals. Route to outpatient clinic.");
                } else {
                    System.out.println("Triage Level: Normal. Patient stable.");
                }
            }
        }
    }
}

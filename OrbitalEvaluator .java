 class OrbitalEvaluator {
    public static void main(String[] args) {
        double velocityKms = 9.8;
        double altitudeKm = 420.0;
        boolean engineBurnComplete = true;

        if (altitudeKm < 160.0 || altitudeKm > 35786.0) {
            System.out.println("Trajectory State: Critical Failure (Atmospheric Burnout or Escape)");
        } else if (!engineBurnComplete) {
            System.out.println("Trajectory State: Abort. Insufficient Delta-V achieved.");
        } else {
            if (altitudeKm >= 160.0 && altitudeKm <= 2000.0) {
                if (velocityKms >= 7.3 && velocityKms <= 7.9) {
                    System.out.println("Trajectory State: Nominal Low Earth Orbit (LEO) achieved.");
                } else {
                    System.out.println("Trajectory State: Decay vector. Speed out of range for LEO.");
                }
            } else {
                if (velocityKms >= 3.0 && velocityKms <= 3.1) {
                    System.out.println("Trajectory State: Nominal Geostationary Orbit (GEO) achieved.");
                } else {
                    System.out.println("Trajectory State: Trajectory offset. Alternate orbit target required.");
                }
            }
        }
    }
}

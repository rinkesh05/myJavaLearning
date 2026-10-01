class Astrolabe {
    public void calculatePosition() {
        System.out.println("Calculating celestial positions manually using a brass rete.");
    }
}

class DigitalAstrolabe extends Astrolabe {
    @Override
    public void calculatePosition() {
        System.out.println("Calculating celestial positions using real-time GPS coordinates and an internal ephemeris.");
    }
}

public class celestial {
    public static void main(String[] args) {
        Astrolabe ancientDevice = new Astrolabe();
        Astrolabe modernDevice = new DigitalAstrolabe();

        ancientDevice.calculatePosition();
        modernDevice.calculatePosition();
    }
}

class Anemometer {
    public void measureWind() {
        System.out.println("Measuring baseline wind speed using standard cups.");
    }
}

class UltrasonicAnemometer extends Anemometer {
    @Override
    public void measureWind() {
        System.out.println("Measuring 3D wind vectors using ultrasonic sound pulses.");
    }
}

public class anemo {
    public static void main(String[] args) {
        Anemometer basicGauge = new Anemometer();
        Anemometer sonicGauge = new UltrasonicAnemometer();

        basicGauge.measureWind();
        sonicGauge.measureWind();
    }
}

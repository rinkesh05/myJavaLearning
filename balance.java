class Chronometer {
    public void displayTime() {
        System.out.println("Displaying time using a mechanical balance wheel.");
    }
}

class AtomicChronometer extends Chronometer {
    @Override
    public void displayTime() {
        System.out.println("Displaying time based on cesium atom microwave resonance oscillations.");
    }
}

public class balance {
    public static void main(String[] args) {
        Chronometer mechanicalClock = new Chronometer();
        Chronometer atomicClock = new AtomicChronometer();

        mechanicalClock.displayTime();
        atomicClock.displayTime();
    }
}

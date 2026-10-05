abstract class Vehiclep {
    abstract void startEngine();
    abstract void stopEngine();
}

class gadi extends Vehiclep {
    void startEngine() {
        System.out.println("Pushing start button...");
    }

    void stopEngine() {
        System.out.println("Turning off engine...");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Vehiclep myCar = new gadi();
        myCar.startEngine();
        myCar.stopEngine();
    }
}

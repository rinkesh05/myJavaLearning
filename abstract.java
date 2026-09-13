abstract class Vehicle {
    private String brand; // Base property for all vehicles

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    // Abstract method: What it does is defined, but HOW it does it is hidden
    public abstract void startEngine();
}
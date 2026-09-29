class Car_constructor {
    String brand;
    int maxSpeed;

    Car_constructor(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricCar extends Car_constructor {
    int batteryCapacity;

    
    ElectricCar(String brand, int maxSpeed, int batteryCapacity) {
        super(brand, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void displayElectricInfo() {
        displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public static void main(String[] args) {
        ElectricCar myTesla = new ElectricCar("Tesla", 250, 75);

        myTesla.displayElectricInfo();
    }
}

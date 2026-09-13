// 1. The Blueprint (Class)
class Car {
    // State / Attributes
    String brand;
    String color;

    // Constructor to initialize the object state
    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // Behavior / Method
    void drive() {
        System.out.println("The " + color + " " + brand + " is driving.");
    }
}

// 2. Execution Class
public class Main {
    public static void main(String[] args) {
        // Instantiating two unique objects from the same Car class
        Car car1 = new Car("Tesla", "Red");
        Car car2 = new Car("BMW", "Black");

        // Accessing behaviors
        car1.drive(); // Output: The Red Tesla is driving.
        car2.drive(); // Output: The Black BMW is driving.
    }
}

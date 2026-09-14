// 1. The Abstract Base Class
public abstract class Vehicle 
{
    private String brand; // Base property for all vehicles
    
    public Vehicle(String brand) 
    {
        this.brand = brand;
    }
    
    public String getBrand() 
    {
        return this.brand;
    }
    
    // Abstract method: Defined here, but HOW it works is implemented by subclasses
    public abstract void drive();
}

// 2. A Concrete Subclass that extends the abstract class
class Car extends Vehicle 
{
    public Car(String brand) 
    {
        super(brand); // Call the constructor of the parent class
    }

    // Implementing the abstract method
    @Override
    public void drive() 
    {
        System.out.println(getBrand() + " is driving smoothly on the road!");
    }
}

// 3. The Main Class to execute the program
class Main {
    public static void main(String[] args) 
    {
        // Create an instance of the concrete subclass
        Car myCar = new Car("Toyota");
        
        // Call the methods
        myCar.drive();
    }
}
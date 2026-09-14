
public abstract class Vehicle 
{
    private String brand; 
    
    public Vehicle(String brand) 
    {
        this.brand = brand;
    }
    
    public String getBrand() 
    {
        return this.brand;
    }
    
    
    public abstract void drive();
}


class Car extends Vehicle 
{
    public Car(String brand) 
    {
        super(brand); 
    }

    
    @Override
    public void drive() 
    {
        System.out.println(getBrand() + " is driving smoothly on the road!");
    }
}


class Main {
    public static void main(String[] args) 
    {
        
        Car myCar = new Car("Toyota");
    
        myCar.drive();
    }
}
public class Encapsulation
{
    private int speed;

    public Encapsulation() 
    
    {
        this.speed = 0;
    }

    
    public int getSpeed() 
    {
        return speed;
    }


    public void setSpeed(int speed)
     {
        if (speed >= 0)
        
        {
            this.speed = speed;
            System.out.println("Speed set to: " + speed);
        }
    }

    
    public static void main(String[] args) 
    {
    
        Encapsulation car = new Encapsulation();

        
        car.setSpeed(50); 
    }
}
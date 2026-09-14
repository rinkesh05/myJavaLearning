public class cylinder {
    public double radius;
    public double height;

    public double lateralsurfaceArea()
    {
        return 2*Math.PI*radius*height;
    }
    public double Totalsurfacearea()
    {
        return 2*Math.PI*radius*height+(2*Math.PI*radius*radius);
    }
    public double volume()
      {
        return Math.PI*radius*radius*height;
      }
}
 class MYcylinder
{
    public static void main(String args[])
    {
       cylinder r1=new cylinder();
       cylinder r2=new cylinder();

       r1.radius=10;
       r1.height=5;
       

       r2.radius=14;
       r2.height=6;

       System.out.println("The lateral surface area of 1st cylinder is:"+r1.lateralsurfaceArea());
       System.out.println("The total surface area of 1st cylinder is:"+r1.Totalsurfacearea());
       System.out.println("The volume of 1st cylinder is:"+r1.volume());

       System.out.println("The lateral surface area of 2nd cylinder is:"+r2.lateralsurfaceArea());
         System.out.println("The total surface area of 2nd cylinder is:"+r2.Totalsurfacearea());
       System.out.println("The volume of 2nd cylinder is:"+r2.volume());

    }
}


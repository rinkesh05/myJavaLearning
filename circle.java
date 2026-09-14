public class circle
 {
    public double radius;
    public double Area()
    {
         return  Math.PI*radius*radius;
      
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }

}
class my
{
    public static void main(String args [])
    {
        
        circle c1=new circle();
        circle c2=new circle();
        
        c1.radius=7;
        c2.radius=14;

        System.out.println("The Area 1 is: "+c1.Area());
        System.out.println("The perimeter 1 is: "+c1.perimeter());
        System.out.println("The circumference 1 is: "+c1.circumference());


           System.out.println("The Area 2 is: "+c2.Area());
        System.out.println("The perimeter 2 is: "+c2.perimeter());
        System.out.println("The circumference 2 is: "+c2.circumference());
    }
}

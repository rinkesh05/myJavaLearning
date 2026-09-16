public class cylinder2
{
    private double radius;
    private double height;
    
   

    public cylinder2()
    {
        radius=2;
        height=7;
    }
    public cylinder2(double l,double b)
    {
        radius=l;
        height=b;
    } 
    public double getradius()
    {

         return radius;
    }
    public double getheight()
    {
        return height;
    }
   
    public void setLength(double l)
    {
      if(radius>0)
          radius=l;
        else
        radius=0;
    }
    public void setBreadth(double b)
    {
        if (height>0)
            height=b;
        else
        height=0;
    }
   
public  double Area()
    {
        return 2*Math.PI*radius*height;
    }
    public double Totalarea()
    {
        return 2*Math.PI*radius*(height+radius);
    }
    public double volume()
      {
        return Math.PI*radius*radius*height;
      }
    
}
 class x
{
    public static void main(String args[])
    {
    cylinder2 r=new cylinder2();
    cylinder2 r2=new cylinder2(2,5);
       
       System.out.println("The area of 1st cylinder is:"+r.Area());
         System.out.println("The area of 2nd ecylinder is:"+r2.Area());
         System.out.println("The total surface area of 1st cylinder is:"+r.Totalarea());
          System.out.println("The total surface area of 2nd cylinder is:"+r2.Totalarea());
         System.out.println("The volume of 1st cylinder is:"+r.volume());   
         System.out.println("The volume of 2nd cylinder is:"+r2.volume());   
   }
}
public class Rectangle2 {
    private double length;
    private double breadth;
   

    public double getLength()
    {

         return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
   
    public void setLength(double l)
    {
      if(length>0)
          length=l;
        else
        length=0;
    }
    public void setBreadth(double b)
    {
        if (breadth>0)
            breadth=b;
        else
        breadth=0;
    }
   
public  double Area()
    {
        return length*breadth;
    }
    public double Totalarea()
    {
        return 2*(length*breadth);
    }
    public double volume()
      {
        return length*breadth;
      }
    public boolean Issquare()
      {
        if (length == breadth)
            return true;
        else
            return false;
      }
}
 class square
{
    public static void main(String args[])
    {
    Rectangle2 r=new Rectangle2();

       r.setLength(5.5);
       r.setBreadth(6.2);
       
       System.out.println("The area of 1st rectangle is:"+r.Area());
       System.out.println("The total surface area of 1st rectangle is:"+r.Totalarea());
       System.out.println("The volume of 1st rectangle is:"+r.volume());
       System.out.println("It is a square:"+r.Issquare());

      
    }
}

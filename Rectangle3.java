public class Rectangle3 
{
    private double length;
    private double breadth;
   

    public Rectangle3()
    {
        length=2;
        breadth=2;
    }
     public Rectangle3(double l,double b)
    {
        length=l;
        breadth=b;
    } public Rectangle3(double s)
    {
        length=breadth=s;
       
    }
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
 class rectangle
{
    public static void main(String args[])
    {
    Rectangle3 r=new Rectangle3();
    Rectangle3 r2=new Rectangle3(10,5);
     Rectangle3 r3=new Rectangle3(10);
       
       System.out.println("The area of 1st rectangle is:"+r.Area());
         System.out.println("The area of 2nd rectangle is:"+r2.Area());
           System.out.println("The area of 3rd rectangle is:"+r3.Area());
       System.out.println("The total surface area of 1st rectangle is:"+r.Totalarea());
        System.out.println("The total surface area of 2nd rectangle is:"+r2.Totalarea());
         System.out.println("The total surface area of 3rd rectangle is:"+r3.Totalarea());
       System.out.println("The volume of 1st rectangle is:"+r.volume());
        System.out.println("The volume of 2nd rectangle is:"+r2.volume());
         System.out.println("The volume of 3rd rectangle is:"+r3.volume());
       System.out.println("1st is a square:"+r.Issquare());
        System.out.println("2nd is a square:"+r2.Issquare());
         System.out.println("3rd is a square:"+r3.Issquare());

      
    }
}


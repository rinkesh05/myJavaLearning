public class Rectangle {
    public double length;
    public double breadth;
    public double height;

    public double Area()
    {
        return length*breadth;
    }
    public double Totalarea()
    {
        return 2*(length*breadth+breadth*height+height*length);
    }
    public double volume()
      {
        return length*breadth*height;
      }
}
 class MY
{
    public static void main(String args[])
    {
       Rectangle r1=new Rectangle();
       Rectangle r2=new Rectangle();

       r1.length=10;
       r1.breadth=5;
       r1.height=20;

       r2.length=14;
       r2.breadth=20;
       r2.height=6;

       System.out.println("The area of 1st rectangle is:"+r1.Area());
       System.out.println("The total surface area of 1st rectangle is:"+r1.Totalarea());
       System.out.println("The volume of 1st rectangle is:"+r1.volume());

       System.out.println("The area of 2nd rectangle is:"+r2.Area());
         System.out.println("The total surface area of 2nd rectangle is:"+r2.Totalarea());
       System.out.println("The volume of 2nd rectangle is:"+r2.volume());

    }
}

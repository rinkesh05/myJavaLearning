import java.lang.*;
import java.util.Scanner;

public class cuboid 
{
      public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
       int length,breadth,height;
       double area,volume;
       System.out.println("Enter length breadth abd height:");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();

        area=(2*(length*breadth+breadth*height+height*length));
        volume=(length*breadth*height);
        System.out.println("The area of cuboid is:" +area);
        System.out.println("The volume of cuboid is:" +volume);
     }
    
}

import java.util.Scanner;

public class leapyear
{
    public static void main(String args[]) 
    {
       int X;
       System.out.println("Enter the number that you need to check for leap year:");
       Scanner sc=new Scanner(System.in);
	   int x= sc.nextInt();
	    
	  if(x%4==0)
	  System.out.println(x+" is a leap year");
      else
	  System.out.println(x+" is not a leap year");
    }   
}

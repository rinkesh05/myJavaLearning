import java.util.Scanner;

public class oddeven 
{
    public static void main(String args[]) 
    {
       int num;
       System.out.println("Enter the number that you need to check for odd or even:");
       Scanner sc=new Scanner(System.in);
	   int a= sc.nextInt();
	    
	  if(a%2==0)
	  System.out.println(a+" is a even number");
      else
	  System.out.println(a+" is a odd number");
    }   
}

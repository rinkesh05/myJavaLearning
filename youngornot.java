import java.util.Scanner;

public class youngornot
{
    public static void main(String args[]) 
    {
       int num;
       System.out.println("Enter the age that you need to check for young or not:");
       Scanner sc=new Scanner(System.in);
	   int a= sc.nextInt();

       if(a>18&&a<40)
        System.out.println(a+" is a young age");
       else if(a>=40)
        System.out.println(a+ " is above the young age");
       else
        System.out.println(a+ " is below the young age");
    }
}	    
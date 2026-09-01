import java.util.Scanner;

public class Date 
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the date in the form of dd/mm/yyyy");
       String str= sc.nextLine();

       boolean x = str.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}");
       System.out.println(x+" date is given");
   } 
}

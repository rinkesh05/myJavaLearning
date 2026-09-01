import java.util.Scanner;

public class binary
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a  number");
        String str=sc.nextLine();

        boolean x = str.matches("[01]+");
        System.out.println(x+" is a binary number");

       
   }
}

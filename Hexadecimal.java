import java.util.Scanner;

public class Hexadecimal {
      public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a  number");
        String str=sc.nextLine();

         boolean y = str.matches("[0-9A-F]+");
        System.out.println(y+" is a hexadecimal number");
   }
}

import java.util.Scanner;
public class Radix 
{
    public static void main(String args[])
    {
        String a;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want to find the radix:");
        a= sc.next();
       
        if(a.matches("[01]+"))
            {
              System.out.println(a+ " is a binary number and its radix is 2");
            }
            else if(a.matches("[0-7]+"))
            {
                System.out.println(a+ " is an octal number and its radix is 8");
            }
            else if(a.matches("[0-9]+"))
            {
                System.out.println(a+ " is a decimal number and its radix is 10");
            }
            else if(a.matches("[0-9A-F]+"))
            {
                System.out.println(a+ " is a hexadecimal number and its radix is 16");
            }
             else
             {
                System.out.println(a+ " is not a valid number");
             }
    }
}

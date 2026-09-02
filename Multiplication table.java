import java.util.*;

class MultiplicationTable 
{
    public static void main(String args[])
    {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number for which you want the multiplication table:");
         int x =sc.nextInt();
         

         for(int i=1 ; i<=10; i++ )
            {
               int mul=x*i;
                      System.out.println(mul);
            }
    }
}

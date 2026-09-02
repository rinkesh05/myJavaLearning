import java.util.*;
public class Armstrong
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
      int r, sum = 0;
         int m=n;
        while(n>0)
        {
            r=n%10;
           
           sum= sum+r*r*r;
            n=n/10;
        }
          if(sum==m)
            {
        System.out.println("Its a Armstrong number");
          }
          else
          {
            System.out.println("Its not a Armstrong number");
          }
     }

}

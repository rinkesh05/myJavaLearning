import java.util.*;
public class Armstrong
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int m=n;
        int r,sum=0;
        while(n>0){
          r=n%10;
          n=n/10;
          sum=sum+r*r*r;
        }
        if(sum==m){
          System.out.println(sum+"is a armstrong number");
        }
        else{
           System.out.println(sum+"is not a armstrong number");
        }
     }

}

import java.util.Scanner;

public class searching 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
          
        System.out.println("Enter the digit that you are searching for:");
             int x=sc.nextInt();
            int A[]={3,9,7,8,12,6,15,5,4,10};

            for(int i=0;i<A.length;i++)
            {
                if(A[i]==x)
                {
                    System.out.println(" Element found at  "+i);
                    System.exit(0);
                }

                
            }
        System.out.println("not found");      
    }   

}
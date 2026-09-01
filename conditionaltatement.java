import java.util.Scanner;
public class conditionaltatement
 {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int a,b,c;
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
         b=sc.nextInt();
        System.out.println("Enter the value of c:");
        c= sc.nextInt();
       if(a>b&&a>c)
       System.out.println(a +" "+" a has the greatest value");
       else if(b>c)
       System.out.println(b + " "+"b has the greatest value");
       else
        System.out.println(c +" "+ "c has the greatest value");

    }
}

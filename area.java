import java.util.Scanner;

public class area {
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        {
            
        System.out.println("Enter the value of base of the triangle is:");
            int a =S.nextInt();
        System.out.println("Enter the value of height of the triangle is:");
               int b =S.nextInt();

             float c = (float)1.0/2* (a*b);

        System.out.println("The area of circle is:"+ c);
        }
    }
}

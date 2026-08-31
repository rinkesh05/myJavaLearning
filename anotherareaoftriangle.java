import java.util.Scanner;
public class anotherareaoftriangle{
    public static void main(String args[])
    {
        int  a,b,c;
        float s;
        double area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of all side of triangle");

        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
          s=(a+b+c)/2f;
          area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
          System.out.println("The area of triangle is:" +area);
    }
}

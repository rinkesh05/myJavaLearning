import java.util.Scanner;

public class Dayswitchcase
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for which you want to check the day");
        int a=sc.nextInt();
        switch(a)
        {
           case 1 : System.out.println(a + " is monday");
                        break;
           case 2 : System.out.println(a + " is tuesday");
                        break;
           case 3 : System.out.println(a + " is wednesday");
                        break;
           case 4 : System.out.println(a + " is thusday");
                        break;
           case 5 : System.out.println(a + " is friday");
                        break;
           case 6 : System.out.println(a + " is saturday");
                        break;
           case 7 : System.out.println(a + " is sunday");
                        break;
            default : System.out.println(a + " is a invalid number");
        }
       
    }
}

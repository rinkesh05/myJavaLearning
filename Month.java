import java.util.Scanner;

public class Month
 {
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the month in digit format (1-12):");
        int a= x.nextInt();

        switch(a)
        {
            case 1: System.out.println(a+ " is january");
                           break;
            case 2: System.out.println(a+ " is february");
                           break;
            case 3: System.out.println(a+ " is maarch");
                           break;
            case 4: System.out.println(a+ "is april");
                           break;
            case 5: System.out.println(a+ " is may");
                           break;
            case 6: System.out.println(a+ " is june");
                           break;
            case 7: System.out.println(a+ " is july");
                           break;
            case 8: System.out.println(a+ " is august");
                           break;
            case 9: System.out.println(a+ " is september");
                           break;
            case 10: System.out.println(a+ " is october");
                           break;
            case 11: System.out.println(a+ " is november");
                           break;
            case 12: System.out.println(a+ " is december");
                           break;
        }
    }
}

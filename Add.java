import java.util.Scanner;

class Add
{
    static int a,b,c;
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a = S.nextInt();
        b = S.nextInt();
        c = a+b;

        System.out.println("sum of two no. is:"+c);

    }
}
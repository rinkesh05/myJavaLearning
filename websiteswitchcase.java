import java.util.Scanner;

public class websiteswitchcase 
{
    public static void main(String args[])
    {
        Scanner q= new Scanner(System.in);
        System.out.println("Enetr the Website name:");
        String a= q.nextLine();

        switch (a)
        {
          case ".com" : System.out.println(a + " is a comercial website");
                             break;
        case ".org" : System.out.println(a + " is a organisational website");
                             break;
        case ".in" : System.out.println(a + " is a indian website");
                             break;
        case ".net" : System.out.println(a + " is a network website");
                             break;
            default: System.out.println(a + " is a invalid website");
                break;
        }

    }
}

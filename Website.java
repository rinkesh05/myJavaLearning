import java.util.Scanner;
public class Website                  
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);  
      System.out.println("Enter the website name:");
      String web= sc.nextLine();

      String protocol=web.substring(0,web.indexOf(":"));

      if(protocol.equals("http"))
      {
        System.out.println("Hyper text transfer protocol");
      }
      else if(protocol.equals("ftp"))
      {
        System.out.println("File transfer protocol");
      }
      else if(protocol.equals("https"))
      {
        System.out.println("Hyper text transfer protocol secure");
      }
      else
      {
        System.out.println("Invalid input");
      }



    //   if(web.endsWith(".com"))
    //   {
    //      System.out.println("Commercial website");
    //    }
    //      else if(web.endsWith(".org"))
    //      {
    //         System.out.println("Organization website");
    //      }
    //      else if(web.endsWith(".in"))
    //      {
    //         System.out.println("Indian website");
    //      }
    //      else
    //      {
    //         System.out.println("Invalid input");
    //      }


          String domain = web.substring(web.indexOf(".")+1);

          if(web.endsWith("com"))
      {
         System.out.println("Commercial website");
         }
         else if(web.endsWith("org"))
         {
            System.out.println("Organization website");
         }
         else if(web.endsWith("in"))
         {
            System.out.println("Indian website");
         }
         else
         {
            System.out.println("Invalid input");
         }

    }
}

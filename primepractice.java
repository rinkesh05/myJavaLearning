public class  primepractice 
{
static boolean isprime(int n)
{
    for(int i=2;i<n/2;i++)
    {
     if(n%2==0)
          return false;
    }
    return true;
}
      public static void main(String[]args)
      {
         int x=10;
          if(isprime (x))
          {
               System.out.println(x+" is  prime");
          }
          else
          {
               System.out.println(x+"is not prime");
          }
      }
    
}

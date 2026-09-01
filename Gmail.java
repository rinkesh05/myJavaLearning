public class Gmail 
{
    public static void main (String args[])
    {
        String str="programmer@Gmail.com";

        int i= str.indexOf('@');
        String username=str.substring(0,i);
        String domain=str.substring(i+1,str.length());

        System.out.println(username);
        System.out.println(domain);

        System.out.println(domain.startsWith("Gmail"));

    }
}

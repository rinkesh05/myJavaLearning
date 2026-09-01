public class matchingstring 
{
    public static void main(String args[])
    {
        String str1="c";
        System.out.println(str1.matches("."));
        String str2="abc";
        System.out.println(str2.matches("."));
        String str3="a";
        System.out.println(str3.matches("[abc]"));
        String str4="d";
        System.out.println(str4.matches("[^abc]"));
        String str5="g";
        System.out.println(str5.matches("[a-z0-9A-Z]"));
        String str6="a6";
        System.out.println(str6.matches("[a-z][0-9]"));
        
    }
}

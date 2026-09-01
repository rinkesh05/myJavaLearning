public class metastring
 {
     public static void main(String args[])
     {
         String str1="a";
         System.out.println(str1.matches("\\D"));

           String str2="3";
         System.out.println(str2.matches("\\d"));
         
         String str3=" ";
         System.out.println(str3.matches("\\s"));

           String str4="3";
         System.out.println(str4.matches("\\S"));

          String str5="6";
         System.out.println(str5.matches("\\w"));

           String str6="^";
         System.out.println(str6.matches("\\W"));
     }
 }

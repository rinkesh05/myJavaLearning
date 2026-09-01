public class Quantifiers {
    public static void main(String args[])
    { 
        String str1="aabc";
        System.out.println(str1.matches("[abc]*"));
        
        String str2="2-a^2";
        System.out.println(str2.matches(".*"));

         String str3="aabdh";
        System.out.println(str3.matches("[a-z]+"));

         String str4="A";
        System.out.println(str4.matches("[A-Z]?"));

         String str5="apple";
        System.out.println(str5.matches("[a-z]{5}"));

         String str6="asccc";
        System.out.println(str6.matches("[a-z]{3,6}"));

        String str7="asccccdhb";
        System.out.println(str7.matches("[a-z]{3,6}"));

    }    
}
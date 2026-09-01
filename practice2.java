public class practice2 
{
    public static void main(String[] args)
        {
           String str1="Hello";
           String str2=new String(str1);
           String str3=str1.substring(1,4);
           char ch1[]={'H','e','l','l','o'};
           String str4=new String(ch1);
           String str5=new String(ch1,1,3);
           byte b1[]={72,101,108,108,111};
           String str6= new String(b1);
           String str7= new String(b1,3,2);
              System.out.println(str1);
              System.out.println(str2);
              System.out.println(ch1);
              System.out.println(str3);
              System.out.println(str4);
              System.out.println(str5);
              System.out.println(str6);
              System.out.println(str7);
        }
}

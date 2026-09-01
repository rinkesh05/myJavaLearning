public class Trim 
{
    public static void main(String args[])
    {
        String str1= ("       Rinkesh          kumar            singh         ");  
        String x= str1.replaceAll("\\s+", " ").trim();
        System.out.println(x);
    }
}

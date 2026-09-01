public class Trim 
{
    public static void main(String args[])
    {
        String str1= ("Rinkesh$kumar%singh");  
        String x= str1.replaceAll("[\\$,%]", " ");
        System.out.println(x);
    }
}

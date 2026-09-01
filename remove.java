public class remove 
{
    public static void main(String args[])
    {
        String str1= ("Rinkesh     kumar     singh");  
        String x= str1.replaceAll("\\s+", " ");
        System.out.println(x);
    }
}
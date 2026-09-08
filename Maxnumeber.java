public class Maxnumeber
{
    static int MAX(int x, int y){     
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    public static void main(String[] args) 
    {
        int a=10,b=15,c;
        c=MAX(a,b);
        System.out.println(c+" ");
    }
}
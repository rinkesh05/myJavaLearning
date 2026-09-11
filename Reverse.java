import java.util.Arrays;

public class Reverse
 {    
    
    
   static  int [] reverse(int A [])
    {
         int B[]=new int[A.length];
         for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        return B;
    }
    public static void main(String args[])
    {
      int[] A = {1, 2, 3, 4, 5};
      System.out.println(Arrays.toString(Reverse.reverse(A)));
    }
}

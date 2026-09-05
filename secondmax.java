

public class secondmax
{
    public static void main(String[] args)
     {
        
            int A[]={3,9,7,8,12,6,15,5,4,10};
             int max1=A[0];
             int max2=A[0];
             A[3]=34;
            for(int i=0;i<A.length;i++)
            {
                if(A[i]>max1)
                {
                    max1=A[i];
                    
                }
                else if(A[i]>max2)
                    {
                        max2=A[i];
                    }
                
            }
        System.out.println( max1 +" is the maximum element in this array");  
        
        System.out.println( max2 +" is the second maximum element in this array");  
    }   

}

public class Methodpractice 
{
     static void change(int A[],int index,int value)
     {
          A[index]=value;
     }
     public static void main(String[] args)
     {
           int A[]={2,4,5,6,12};
           change(A,2,14);

           for(int x:A)
             {
           System.out.println(x);
             }

     }
}

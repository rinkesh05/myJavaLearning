public class methodoverloading
 {
     static int max(int x, int y)
     {
         return x>y?x:y;
     } 
     static float max(float x, float y)
     {
         return x>y?x:y;
     } 
     static int max(int x, int y, int z)
     {
         return x>y&x>z?x:(y>z?y:z);
     } 
     static byte max(byte x, byte y)
     {
         return x>y?x:y;
     } 
     public static void main(String args[])
     {
        System.out.println(max(10,5));
        System.out.println(max(10.2f,50.3f));
        System.out.println(max(10,30,20));
        byte a=10,b=20;
         System.out.println(max(a,b));
     
     }   
}

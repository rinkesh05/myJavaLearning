
public class customer
 {
    private double itemno;
    private String name;
    private double price;
    private int quantity;

     public customer()
     {
        itemno=2601;
        name="John";
        price=2000;
        quantity=5;

     }
     public customer(double i,String n,double p,int q)
     {
        itemno=i;
        name=n;
        price=p;
        quantity=q;
     }
    
      public double getitemno()
      {
        return itemno;
      }
      public String getname()
      {
        return name;
      }
      public double getprice()
      {
        return price;
      }
      public int getquantity()
      {
        return quantity;
      }

      public void setprice(double p)
      {
        price=p;
      }
      public void setquantity(int q)
      {
        quantity=q;
      }

}
class product
{      
    public static void main(String args[])
    {
       customer c1 = new customer();
       customer c2 = new customer(10502,"rohit",1500,2);

        c1.setprice(100);
        c1.setquantity(7);
 
        System.out.println(c1.getitemno());
        System.out.println(c1.getname());
        System.out.println(c1.getprice());
        System.out.println(c1.getquantity());
        
        c2.setprice(200);
        c2.setquantity(3);
      
        System.out.println(c2.getitemno());
        System.out.println(c2.getname());
        System.out.println(c2.getprice());
         System.out.println(c2.getquantity());
    }
}

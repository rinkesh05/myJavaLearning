class Areamol 
{
    //Area of rectangle
    static double area(double l,double b)
    {
        double area = l * b;
        return area;
    }
    //Area of square
    static double area(double l)
    {
        double area = l * l;
        return area;
    }
     //Area of Circle
    static double areaCircle(double r)
    {
        double area = Math.PI * r * r;
        return area;
    }
    //Area of Trapezium
    static double areatrapezium(double a,double b, double h)
    {
        double area = 0.5*(a+b) * h;
        return area;
    }
    public static void main(String args[])
    {
        System.out.println("Area of Rectangle is: "+area(20,10));
        System.out.println("Area of Square is: "+area(20));
        System.out.println("Area of Circle is: "+areaCircle(10));
         System.out.println("Area of Trapezium is: "+areatrapezium(10,12,20));
    }
}

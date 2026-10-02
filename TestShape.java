class Shape {
    double area() {
        System.out.println("Area is not defined");
        return 0;
    }
}

class Circle extends Shape {
    double radius = 5.0;
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape s = new Circle(); 
        System.out.println("Circle Area: " + s.area()); 
    }
}

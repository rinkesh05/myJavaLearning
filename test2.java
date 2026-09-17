class circle2 {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

class cylinder extends circle2 {
    public double height;public class test2 {
    public static void main(String[] args) {
        cylinder c = new cylinder();

        c.radius = 7;
        c.height = 10;

        System.out.println("Surface Area: " + c.area());
        System.out.println("Volume: " + c.volume());
    }
}

    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}


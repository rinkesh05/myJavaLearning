 class TriangleAnalyzer {
    public static void main(String[] args) {
        int sideA = 5;
        int sideB = 5;
        int sideC = 8;

        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            if (sideA == sideB && sideB == sideC) {
                System.out.println("Valid Triangle: Equilateral");
            } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
                System.out.println("Valid Triangle: Isosceles");
            } else {
                System.out.println("Valid Triangle: Scalene");
            }
        } else {
            System.out.println("Invalid Geometry: Sides cannot form a triangle.");
        }
    }
}


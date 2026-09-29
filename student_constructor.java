public class student_constructor {

    String name;
    int age;

    // Default constructor
    public student_constructor() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public student_constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        student_constructor student1 = new student_constructor();
        student_constructor student2 = new student_constructor("Rahul", 20);

        System.out.println("First student:");
        student1.display();

        System.out.println("\nSecond student:");
        student2.display();
    }
}

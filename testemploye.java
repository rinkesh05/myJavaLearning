abstract class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double bonus;

    FullTimeEmployee(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new FullTimeEmployee("Alice", 5000, 1200);
        System.out.println(emp.name + " Salary: $" + emp.calculateSalary());
    }
}


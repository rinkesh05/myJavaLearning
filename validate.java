import java.util.*;

public class validate {
    Scanner sc = new Scanner(System.in);
    String name;

    void inputName() {
        System.out.println("Enter the name:");
        name = sc.next();
    }

    boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]*");
    }

    boolean validate(int age) {
        return age >= 3 && age <= 16;
    }
    public static void main (String args[])
    {
    
    }
}

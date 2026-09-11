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
       validate obj =new validate();
       obj.inputName();

       if (obj.validate(obj.name))  
        {
           System.out.println("The name is valid.");
       }
       else
        {
          System.out.println("The name is not valid.");
       }
    }
}

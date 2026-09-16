public class person {
  
    private String name;
    private int age;
   
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
   
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
      
        person person1 = new person("John Doe", 25);

      
        person1.displayInfo();
    }
}
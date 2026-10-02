class Animal {
    void sound() {
        System.out.println("Animal makes a generic sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Animal ref; 
        
        ref = new Dog(); 
        ref.sound();    
    }
}

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}

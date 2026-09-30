
class Animal {
  
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}


class ovverriding {
    public static void main(String[] args) {
      
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); 

       
        Animal myDog = new Dog(); 
        myDog.makeSound(); 
    }
}

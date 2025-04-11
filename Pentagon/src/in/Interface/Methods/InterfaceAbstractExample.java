package in.Interface.Methods;

interface Animal {
    void makeSound();  // Abstract method (must be implemented)
}

class Dog implements Animal {
    public void makeSound() {  // Implementing the abstract method
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class InterfaceAbstractExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}

package in.Polymorphism;

class Animal {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Upcasting
        Animal a2 = new Cat();  // Upcasting

        a1.sound();  // Calls Dog's sound()
        a2.sound();  // Calls Cat's sound()
    }
}

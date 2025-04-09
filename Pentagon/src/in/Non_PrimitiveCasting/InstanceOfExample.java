package in.Non_PrimitiveCasting;



class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting

        // Safe downcasting using instanceof
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.sound();  // Output: Dog barks
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;  // Won't execute this block
            cat.sound();
        }
    }
}


package in.Non_PrimitiveCasting;

//class Animal {
//    void sound() {
//        System.out.println("Animal makes a sound");
//    }
//}
//
//class Dog extends Animal {
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}

public class DowncastingExample {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting
        Dog dog = (Dog) animal;      // Downcasting: Animal to Dog
        dog.sound();  // Output: Dog barks

        // If animal was not a Dog, the following would throw a ClassCastException:
        // String str = (String) animal;  // Runtime error
    }
}


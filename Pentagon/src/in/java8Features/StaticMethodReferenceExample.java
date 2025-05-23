package in.java8Features;

class Utility {
    public static void greet() {
        System.out.println("Hello from static method!");
    }
}

public class StaticMethodReferenceExample {
    public static void main(String[] args) {
        Runnable r = Utility::greet;  // Method reference
        r.run();                      // Equivalent to () -> Utility.greet()
    }
}


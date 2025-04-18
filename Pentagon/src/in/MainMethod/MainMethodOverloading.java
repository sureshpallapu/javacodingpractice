package in.MainMethod;

public class MainMethodOverloading {
    
    // Standard main method (JVM calls this method)
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
        
        // Calling overloaded main methods manually
        main(10);
        main("Hello");
    }

    // Overloaded main method with int parameter
    public static void main(int a) {
        System.out.println("Overloaded main method with int: " + a);
    }

    // Overloaded main method with String parameter
    public static void main(String str) {
        System.out.println("Overloaded main method with String: " + str);
    }
}

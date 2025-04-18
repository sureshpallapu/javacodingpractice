package in.Polymorphism;

class MathUtils {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with different parameter types
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOveloading {
    public static void main(String[] args) {
        MathUtils obj = new MathUtils();
        System.out.println(obj.add(5, 10));       // Calls method with 2 int parameters
        System.out.println(obj.add(5, 10, 20));   // Calls method with 3 int parameters
        System.out.println(obj.add(5.5, 2.3));   // Calls method with double parameters
    }
}

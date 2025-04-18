package in.MainMethod;

class Parent2 {
    static void display() {
        System.out.println("Parent class static method");
    }
}

class Child2 extends Parent2 {
    static void display() { // This is method hiding, not overriding
        System.out.println("Child class static method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent2 obj = new Child2(); // Reference type is Parent
        obj.display();  // Calls Parent's display() due to method hiding
    }
}

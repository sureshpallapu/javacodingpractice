package in.java8Features;

import java.util.*;
import java.util.function.*;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {

        // 1. Lambda with Functional Interface
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));

        // 2. Lambda with Thread
        Runnable threadTask = () -> {
            System.out.println("Thread is running using lambda expression.");
        };
        Thread thread = new Thread(threadTask);
        thread.start();

        // 3. Lambda with Collection (forEach)
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Mango");
        System.out.println("\nFruits list:");
        fruits.forEach(fruit -> System.out.println("Fruit: " + fruit));

        // 4. Lambda with Stream filter
        System.out.println("\nFruits starting with 'C':");
        fruits.stream()
              .filter(f -> f.startsWith("C"))
              .forEach(System.out::println);

        // 5. Lambda with Comparator
        List<String> names = Arrays.asList("John", "Alice", "Bob", "David");
        System.out.println("\nBefore sorting: " + names);

        Collections.sort(names, (s1, s2) -> s1.compareTo(s2)); // Ascending sort
        System.out.println("After sorting: " + names);

        // 6. Built-in Functional Interface: Predicate
        Predicate<String> startsWithA = str -> str.startsWith("A");
        System.out.println("\nNames starting with A:");
        names.stream().filter(startsWithA).forEach(System.out::println);
    }
}

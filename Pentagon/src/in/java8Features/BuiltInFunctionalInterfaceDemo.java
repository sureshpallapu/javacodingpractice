package in.java8Features;

import java.util.function.*;

public class BuiltInFunctionalInterfaceDemo {
    public static void main(String[] args) {
        Predicate<String> isLong = s -> s.length() > 5;
        System.out.println("Is 'Welcome' long? " + isLong.test("Welcome"));

        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 4: " + square.apply(4));

        Consumer<String> display = s -> System.out.println("Hello, " + s);
        display.accept("Java");

        Supplier<String> getMessage = () -> "Hello from Supplier!";
        System.out.println(getMessage.get());
    }
}

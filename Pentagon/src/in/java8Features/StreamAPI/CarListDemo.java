package in.java8Features.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class CarListDemo {
    public static void main(String[] args) {
        // List of Car names (Strings)
        List<String> cars = Arrays.asList("Maruti Swift", "Hyundai i20", "Tata Nexon", "Kia Seltos");

        // Example 1: Convert all car names to uppercase using map()
        List<String> upperCaseCars = cars.stream()
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());

        System.out.println("Car Names in Uppercase:");
        upperCaseCars.forEach(System.out::println);

        // Example 2: Get the lengths of each car name using map()
        List<Integer> carNameLengths = cars.stream()
                                           .map(String::length)
                                           .collect(Collectors.toList());

        System.out.println("\nLengths of Car Names:");
        carNameLengths.forEach(System.out::println);
    }
}

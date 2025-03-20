package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Iterating over the list
        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

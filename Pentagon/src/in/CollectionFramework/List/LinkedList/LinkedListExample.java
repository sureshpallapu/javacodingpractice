package in.CollectionFramework.List.LinkedList;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Removing an element
        numbers.remove(1); // Removes 20

        // Iterating using an iterator
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("Numbers:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

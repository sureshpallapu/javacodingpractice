package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ListSorting {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        // Sorting list in natural order (ascending)
        Collections.sort(names);
        System.out.println("Sorted List: " + names);
    }
}

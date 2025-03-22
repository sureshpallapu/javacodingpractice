package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListSortExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Banana", "Cherry", "Apple"));

        // Sorting in ascending order
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}

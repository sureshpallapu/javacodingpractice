package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList("One", "Two", "Three"));

        ListIterator<String> iterator = items.listIterator();

        System.out.println("Forward Iteration:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Backward Iteration:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

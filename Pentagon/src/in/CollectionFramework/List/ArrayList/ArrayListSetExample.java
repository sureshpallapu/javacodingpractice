package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListSetExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        // Updating an element
        list.set(1, "Mango");

        System.out.println("Updated ArrayList: " + list);
    }
}

package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListRemoveExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        // Removing by index
        list.remove(1); 

        // Removing by value
        list.remove("Cherry");

        System.out.println("After Removal: " + list);
    }
}

package in.CollectionFramework.List.LinkedList;

import java.util.*;

public class LinkedListRemoveFirstLastExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        list.removeFirst(); // Removes "Apple"
        list.removeLast();  // Removes "Cherry"

        System.out.println("After Removal: " + list);
    }
}

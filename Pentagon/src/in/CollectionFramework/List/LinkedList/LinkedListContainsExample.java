package in.CollectionFramework.List.LinkedList;

import java.util.*;

public class LinkedListContainsExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        System.out.println("Contains 'Banana'? " + list.contains("Banana"));
        System.out.println("Contains 'Mango'? " + list.contains("Mango"));
    }
}

package in.CollectionFramework.List.LinkedList;

import java.util.*;

public class LinkedListGetFirstLastExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
    }
}

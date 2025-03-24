package in.CollectionFramework.List.LinkedList;

import java.util.*;

public class LinkedListAddFirstLastExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Banana");
        list.addFirst("Apple");  // Adds at the beginning
        list.addLast("Cherry");  // Adds at the end

        System.out.println("LinkedList: " + list);
    }
}

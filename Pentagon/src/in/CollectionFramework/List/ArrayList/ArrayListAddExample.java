package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListAddExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Adding at a specific index
        list.add(1, "Mango"); 

        System.out.println("ArrayList: " + list);
    }
}


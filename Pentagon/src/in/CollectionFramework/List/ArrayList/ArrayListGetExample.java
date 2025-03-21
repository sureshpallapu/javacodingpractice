package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListGetExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        System.out.println("First Element: " + list.get(0)); // Apple
        System.out.println("Second Element: " + list.get(1)); // Banana
    }
}

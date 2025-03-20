package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListContainsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        System.out.println("Contains 'Banana'? " + list.contains("Banana"));
        System.out.println("Contains 'Mango'? " + list.contains("Mango"));
    }
}

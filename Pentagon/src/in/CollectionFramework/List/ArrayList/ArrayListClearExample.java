package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListClearExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        list.clear();

        System.out.println("ArrayList after clear(): " + list);
    }
}


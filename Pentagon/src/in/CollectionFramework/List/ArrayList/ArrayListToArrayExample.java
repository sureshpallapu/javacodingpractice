package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListToArrayExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        String[] array = list.toArray(new String[0]);

        System.out.println("Array: " + Arrays.toString(array));
    }
}


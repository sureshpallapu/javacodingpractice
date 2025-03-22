package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListSubListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Mango", "Orange"));

        List<String> subList = list.subList(1, 4);
        System.out.println("Sublist: " + subList);
    }
}

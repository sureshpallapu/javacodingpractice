package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListIterationExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
// using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//        using for-each loop
        for (String fruit : list) {
            System.out.println(fruit);
        }
//        using iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

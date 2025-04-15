package in.CollectionFramework.List;

import java.util.*;

public class ListExample2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        List<Integer> stack = new Stack<>();

        arrayList.add(10);
        linkedList.add(20);
        vector.add(30);
        stack.add(40);

        System.out.println(arrayList); // Output: [10]
        System.out.println(linkedList); // Output: [20]
        System.out.println(vector); // Output: [30]
        System.out.println(stack); // Output: [40]
        arrayList.forEach(System.out::println);
        
        List<String> list = Arrays.asList("A", "B", "C");
        String[] array = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array)); // Output: [A, B, C]

        String[] array2 = {"X", "Y", "Z"};
        List<String> list2 = Arrays.asList(array2);
        System.out.println(list2); // Output: [X, Y, Z]
    }
}

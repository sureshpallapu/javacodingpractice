package in.CollectionFramework.List.LinkedList;

import java.util.*;

public class LinkedListToArrayExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));

		String[] array = list.toArray(new String[0]);

		System.out.println("Array: " + Arrays.toString(array));
	}
}

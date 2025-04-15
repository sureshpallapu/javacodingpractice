package in.CollectionFramework.List.LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteratingExample {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));

		System.out.println("First Element: " + list.getFirst());
		System.out.println("Last Element: " + list.getLast());

//Using a for loop

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
//Using a for-each loop

		for (String fruit : list) {
			System.out.println(fruit);
		}

//Using an Iterator

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

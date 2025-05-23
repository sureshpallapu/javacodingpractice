package in.java8Features.StreamAPI;

import java.util.*;

public class FilterExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 10, 15);
		
		System.err.println("number greater than 5");
		numbers.stream()
		.filter(n -> n > 5)
		.forEach(System.out::println);
		
		System.err.println("Even numbers");
		numbers.stream()
	       .filter(n -> n % 2 == 0)
	       .forEach(System.out::println);
	

		System.err.println("odd numbers");
		numbers.stream()
	       .filter(n -> n % 2 != 0)
	       .forEach(System.out::println);
		
		System.err.println(" Filter Distinct Elements Greater than 10");
		numbers.stream()
	       .distinct()
	       .filter(n -> n > 10)
	       .forEach(System.out::println);
	}
}

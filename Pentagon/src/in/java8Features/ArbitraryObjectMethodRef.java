package in.java8Features;

import java.util.*;

public class ArbitraryObjectMethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        
        // Sort using method reference
        Collections.sort(names, String::compareToIgnoreCase);
        
        names.forEach(System.out::println);  // Print using method reference
    }
}


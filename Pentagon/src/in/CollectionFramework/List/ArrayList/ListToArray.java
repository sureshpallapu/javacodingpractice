package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ListToArray {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(Arrays.asList("USA", "India", "Canada"));

        // Convert to array
        String[] countryArray = countries.toArray(new String[0]);

        System.out.println("Array: " + Arrays.toString(countryArray));
    }
}


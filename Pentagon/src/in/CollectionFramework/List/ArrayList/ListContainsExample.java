package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ListContainsExample {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red"); // Duplicate

        System.out.println("Colors: " + colors);
        System.out.println("Contains 'Blue'? " + colors.contains("Blue"));
    }
}

package in.CollectionFramework.List.ArrayList;

import java.util.*;

public class ArrayListIsEmptyExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Is list empty? " + list.isEmpty());
        
        list.add("Apple");
        System.out.println("Is list empty now? " + list.isEmpty());
    }
}


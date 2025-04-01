package in.CollectionFramework.List.ArrayList;

import java.util.*;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}

public class CustomObjectList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("suresh", 20));
        students.add(new Student("pallapu", 22));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

package in.java8Features;

import java.util.function.Supplier;

class Student {
    Student() {
        System.out.println("Student object created!");
    }
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Supplier<Student> supplier = Student::new;  // Constructor reference
        Student s = supplier.get();                 // Equivalent to () -> new Student()
    }
}


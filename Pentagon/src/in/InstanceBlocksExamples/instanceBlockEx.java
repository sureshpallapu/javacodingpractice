package in.InstanceBlocksExamples;

class Employee {
    String name;
    int age;

    // Instance block (Executes before the constructor)
    {
        name = "Default Name";
        age = 25;
        System.out.println("Instance Block Executed");
    }

    Employee() {
        System.out.println("Constructor Executed");
    }
}

public class instanceBlockEx {
    public static void main(String[] args) {
        Employee emp = new Employee(); // Object created, instance block runs first
        System.out.println(emp.name + " - " + emp.age);
    }
}

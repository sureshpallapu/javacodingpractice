package in.ObjectClass;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && name.equals(employee.name);
    }
}
public class EqualsMethod{
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "John");
        Employee e2 = new Employee(101, "John");
        System.out.println(e1.equals(e2)); // Output: true
    }
}

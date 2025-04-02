package in.Interface.Methods;

interface Employee {
    void calculateSalary();
}

class FullTimeEmployee implements Employee {
    private double salary = 5000;

    public void calculateSalary() {
        System.out.println("Full-Time Employee Salary:  " + salary);
    }
}

class PartTimeEmployee implements Employee {
    private double hourlyRate = 20;
    private int hoursWorked = 80;

    public void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Part-Time Employee Salary:  " + salary);
    }
}

public class EmployeeSalaryExample {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();

        emp1.calculateSalary();
        emp2.calculateSalary();
    }
}

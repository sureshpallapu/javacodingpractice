package in.abstraction;

abstract class Employee {
	String name;
	int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	abstract void calculateSalary();

	void displayEmployee() {
		System.out.println("Employee ID: " + id + ", Name: " + name);
	}
}

class FullTimeEmployee extends Employee {
	double salary;

	FullTimeEmployee(String name, int id, double salary) {
		super(name, id);
		this.salary = salary;
	}

	void calculateSalary() {
		System.out.println("Full-Time Employee Salary: $" + salary);
	}
}

class PartTimeEmployee extends Employee {
	double hourlyRate;
	int hoursWorked;

	PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	void calculateSalary() {
		System.out.println("Part-Time Employee Salary: $" + (hourlyRate * hoursWorked));
	}
}

public class EmployeeSystem {
	public static void main(String[] args) {
		Employee e1 = new FullTimeEmployee("John", 101, 50000);
		Employee e2 = new PartTimeEmployee("Emma", 102, 20, 80);

		e1.displayEmployee();
		e1.calculateSalary();

		System.out.println("------------------------");

		e2.displayEmployee();
		e2.calculateSalary();
	}
}

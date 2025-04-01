package in.Encapsulation;

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = (salary > 0) ? salary : 0;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double percentage) {
		if (percentage > 0) {
			salary += salary * (percentage / 100);
		}
	}
}

public class EmployeeDemo {
	public static void main(String[] args) {
		Employee emp = new Employee("John", 50000);
		System.out.println(emp.getName() + "'s Salary: " + emp.getSalary());

		emp.raiseSalary(10);
		System.out.println("Updated Salary: " + emp.getSalary());
	}
}
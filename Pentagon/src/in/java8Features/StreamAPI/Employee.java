package in.java8Features.StreamAPI;

import java.util.*;

public class Employee {
	int id;
	String name;
	String department;
	double salary;

	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + department + " - " + salary;
	}

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(101, "Suresh", "HR", 50000),
				new Employee(102, "durga", "IT", 70000),
				new Employee(103, "bali", "IT", 80000),
				new Employee(104, "ganga", "Finance", 60000),
				new Employee(105, "shalini ", "IT", 70000)
				);
		 
		System.err.println(" Sorted based on salary ");
		employees.stream()
		.sorted(Comparator.comparing(Employee::getSalary))
		.forEach(System.out::println);
		
		System.err.println("Sorted based on names");
		employees.stream()
		.sorted(Comparator.comparing(Employee::getName).reversed())
		.forEach(System.out::println);
	}
}

package in.Encapsulation;

class Person {
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = (age > 0) ? age : 0; // Ensuring valid age
	}

	// Getter and Setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) { // Ensuring only positive age is set
			this.age = age;
		}
	}
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		Person p = new Person("Suresh", 25);
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());

		// Modifying using setter
		p.setAge(30);
		System.out.println("Updated Age: " + p.getAge());
	}
}

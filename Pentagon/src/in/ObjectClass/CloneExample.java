package in.ObjectClass;

class Student implements Cloneable {
	String name;

	Student(String name) {
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student("Mike");
		Student s2 = (Student) s1.clone();
		Student s3 = (Student) s2.clone();
		System.out.println(s2.name); // Output: Mike
		System.out.println(s3.name); // Output: Mike
	}
}

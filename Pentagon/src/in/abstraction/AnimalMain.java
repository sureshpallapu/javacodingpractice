package in.abstraction;

abstract class Animal {
	abstract void makeSound(); // Abstract method

	void sleep() {
		System.out.println("Sleeping...");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("Bark! Bark!");
	}
}

public class AnimalMain {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.makeSound();
		myDog.sleep();
	}
}

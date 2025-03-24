package in.abstraction;

abstract class Bird {
	abstract void eat();
}

abstract class Eagle extends Bird {

}

class GoldenEagle extends Eagle {
	void eat() {
		System.out.println("Golden eagle eats fishes etc.,");
	}
}

class SerpentEagle extends Eagle {
	void eat() {
		System.out.println("sepernt eagle eats snakes");
	}
}

class Parrot extends Bird {
	void eat() {
		System.out.println("Parrot eats furits ,seeds ");
	}
}

public class BirdsExample {

	public static void main(String[] args) {
		Parrot p = new Parrot();
		p.eat();
		Peacock pc = new Peacock();
		pc.eat();
		SerpentEagle se = new SerpentEagle();
		se.eat();
		GoldenEagle ge = new GoldenEagle();
		ge.eat();
	}

}

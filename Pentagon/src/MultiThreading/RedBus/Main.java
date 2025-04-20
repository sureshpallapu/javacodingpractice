package MultiThreading.RedBus;

public class Main {
	public static void main(String[] args) {
		REDBUS R = new REDBUS();
		User1 u1 = new User1(R);
		u1.setName("USER-1");
		User1 u2 = new User1(R);
		u2.setName("USER-2");
		u1.start();
		u2.start();
	}
}

package in.ObjectClass;

class SharedResource {
	synchronized void printMessage() {
		try {
			System.out.println("Waiting...");
			wait(); // Waits until notify() is called
			System.out.println("Resumed...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void resumeMessage() {
		notify(); // Wakes up waiting thread
	}
}

public class notifyandwait {
	public static void main(String[] args) {
		SharedResource obj = new SharedResource();

		Thread t1 = new Thread(obj::printMessage);
		Thread t2 = new Thread(obj::resumeMessage);

		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		t2.start();
	}
}

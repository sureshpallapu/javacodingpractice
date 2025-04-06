package MultiThreading.Priorities;

public class ex extends Thread {
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("child thread ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static void main(String[] args) {
	ex e=new ex();
	e.setPriority(MAX_PRIORITY);
	e.start();
	try {
		e.join();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	for(int i=0;i<5;i++) {
		System.out.println("parent thread ");
	}
}
}

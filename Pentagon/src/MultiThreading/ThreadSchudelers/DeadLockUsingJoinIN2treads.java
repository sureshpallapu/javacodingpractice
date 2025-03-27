package MultiThreading.ThreadSchudelers;

public class DeadLockUsingJoinIN2treads extends Thread{
static Thread m;
public void run() {
//	try {
//		m.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	for (int i=1;i<=5;i++) {
		System.out.println("child ");
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static void main(String[] args)  {
	 m=currentThread();
	 DeadLockUsingJoinIN2treads d=new DeadLockUsingJoinIN2treads();
	 d.start();
	try {
		d.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for (int i=1;i<=5;i++) {
		System.out.println("main ");
	}
}
}

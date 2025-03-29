package MultiThreading.ThreadSchudelers;

public class DaemonExample2 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread running...");
        } else {
            System.out.println("User thread running...");
        }
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DaemonExample2 t1 = new DaemonExample2();
        DaemonExample2 t2 = new DaemonExample2();
        DaemonExample2 t3 = new DaemonExample2();

        t1.setDaemon(true); // Setting t1 as a daemon thread

        t1.start();
        t2.start(); // User thread
        t3.start(); // User thread
    }
}


package MultiThreading.ThreadSchudelers;

public class JoinExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();

        t1.start(); 
        try {
            t1.join();  // Main thread waits for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();  // t2 starts only after t1 completes
    }
}


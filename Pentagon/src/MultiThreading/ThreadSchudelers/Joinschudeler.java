package MultiThreading.ThreadSchudelers;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Joinschudeler {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        
        t.start();
        try {
            t.join(200000);  // Main thread waits until t completes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      
        System.out.println("Main thread resumes after MyThread completes.");
    }
}


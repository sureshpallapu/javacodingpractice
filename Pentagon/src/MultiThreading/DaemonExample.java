package MultiThreading;

public class DaemonExample extends Thread {
    public void run() {
        System.out.println("Daemon thread running...");
    }
    
    public static void main(String[] args) {
        DaemonExample t = new DaemonExample();
        t.setDaemon(true);
        t.start();
    }
}


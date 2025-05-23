package MultiThreading.ThreadSchudelers;


class BankAccount {
    private int balance = 1000;

    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds for " + Thread.currentThread().getName());
        }
    }
}

public class RaceConditionExample implements Runnable {
    BankAccount account = new BankAccount();

    public void run() {
        account.withdraw(700);  // Two threads trying to withdraw simultaneously
    }

    public static void main(String[] args) {
        RaceConditionExample obj = new RaceConditionExample();

        Thread t1 = new Thread(obj, "User1");
        Thread t2 = new Thread(obj, "Use r2");

        t1.start();
        t2.start();
    }
}

package in.Encapsulation;

class BankAccount {
	private String accountHolder;
	private double balance;

	public BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	// Getter and Setter methods
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
}

public class EncapsulationExample {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("suresh", 5000.0);
		account.deposit(2000.0);
		account.withdraw(1000.0);
		System.out.println("Account Balance: " + account.getBalance());
	}
}

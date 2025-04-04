package Bank;

import java.util.ArrayList;

class BankAccount {
    private static int accountCounter = 1000; // Auto-incremented account ID
    private int accountId;
    private String name;
    private String password;
    private double balance;
    private static ArrayList<BankAccount> accounts = new ArrayList<>(); // Store all accounts

    public BankAccount(String name, String password, double balance) {
        this.accountId = ++accountCounter;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public static BankAccount createBankAccount(String name, String password, double balance) {
        if (name.trim().isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
            return null;
        }
        if (password.length() < 6) {
            System.out.println("Error: Password must be at least 6 characters long.");
            return null;
        }
        if (balance < 0) {
            System.out.println("Error: Initial balance cannot be negative.");
            return null;
        }

        BankAccount newAccount = new BankAccount(name, password, balance);
        accounts.add(newAccount);
        System.out.println("Account created successfully! Your Account ID is: " + newAccount.getAccountId());
        return newAccount;
    }

    public static BankAccount logIn(int accountId, String password) {
        for (BankAccount account : accounts) {
            if (account.accountId == accountId && account.password.equals(password)) {
                System.out.println("Login successful!");
                return account;
            }
        }
        System.out.println("Error: Invalid account ID or password.");
        return null;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.println("Successfully deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Available balance: $" + balance);
            return;
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: $" + amount);
    }

    public void balance() {
        System.out.println("Current Balance: $" + balance);
    }

    public void showDetails() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: $" + balance);
    }
}

package in.Interface.Finalvaribles;

interface BankConstants {
    double MIN_BALANCE = 500.0;  // Minimum balance required
    double INTEREST_RATE = 4.5;  // 4.5% interest rate
    int MAX_TRANSACTIONS = 10;   // Max transactions per day
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < BankConstants.MIN_BALANCE) {
            System.out.println("Initial balance must be at least " + BankConstants.MIN_BALANCE);
            this.balance = BankConstants.MIN_BALANCE;
        } else {
            this.balance = initialBalance;
        }
    }

    public void showDetails() {
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + BankConstants.INTEREST_RATE + "%");
        System.out.println("Max Transactions Allowed: " + BankConstants.MAX_TRANSACTIONS);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(300);  // Less than MIN_BALANCE
        account.showDetails();
    }
}

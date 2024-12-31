package Pentagon;

import java.util.Scanner;

public class ATMDemo {
	Scanner s = new Scanner(System.in);
	long acno;
	String name;
	int pin = 1634;
	int bal = 1000;

	int withdraw() {
		System.out.println("enter withdrawn amount");
		int withdraw = s.nextInt();
		if (withdraw > bal) {
			System.out.println("Insufficient balance!");
		} else {
			bal = bal - withdraw;
			System.out.println("Withdrawal successful. Remaining balance: " + bal);
		}
		return withdraw;
	}

	int Deposit() {
		System.out.println("enter the deposit amount");
		int deposit = s.nextInt();
		
		bal = deposit + bal;
		System.out.println("Deposit successful. New balance: " +bal);
		return deposit;
	}

	void checkbalance() {
		System.out.println("The current balance is: " + bal);
	}

	public static void main(String args[]) {
		ATMDemo a = new ATMDemo();
		Scanner s = new Scanner(System.in);
		System.out.println("enter your account number");
		a.acno = s.nextLong();
		System.out.println("enter your user name");
		a.name = s.next();
		while (true) { 
		System.out.println("enter your account pin");
		int userpin = s.nextInt();
		int attempts = 0;
        while (userpin != a.pin && attempts < 2) { 
            attempts++;
            System.out.println("Incorrect PIN. Try again:");
            userpin = s.nextInt();
        }
        if (userpin != a.pin) {
            System.out.println("Too many incorrect attempts. Exiting.");
            System.exit(0);
        }
		while (true) {
			System.out.println("enter your choice---1)withdraw.....2)Deposit.....3)checkbalance....4)exit.....  ");
			int choice = s.nextInt();

			switch (choice) {
			case 1:

				a.withdraw();

				break;

			case 2:

				a.Deposit();

				break;
			case 3:

				a.checkbalance();

				break;
			case 4:
				System.out.println("Thank you for using the ATM. Goodbye!");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}

		}
	}

}

}
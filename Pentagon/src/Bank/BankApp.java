package Bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        BankAccount logInUser = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (logInUser == null) {
                System.out.println("\nWelcome to Pentagon Bank!");
                System.out.println("1: Create Account");
                System.out.println("2: Log In");
                System.out.println("3: Exit");
                System.out.print("Choose an option: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Error: Please enter a valid number.");
                    sc.next(); // Clear invalid input
                    continue;
                }

                int option = sc.nextInt();

                switch (option) {
                    case 1: {
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter your Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter a Password (min 6 characters): ");
                        String password = sc.next();
                        System.out.print("Enter Initial Balance: ");
                        if (!sc.hasNextDouble()) {
                            System.out.println("Error: Invalid balance amount.");
                            sc.next();
                            continue;
                        }
                        double balance = sc.nextDouble();
                        BankAccount.createBankAccount(name, password, balance);
                        break;
                    }
                    case 2: {
                        System.out.print("Enter Account ID: ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Error: Invalid Account ID.");
                            sc.next();
                            continue;
                        }
                        int accountId = sc.nextInt();
                        System.out.print("Enter Password: ");
                        String password = sc.next();
                        logInUser = BankAccount.logIn(accountId, password);
                        break;
                    }
                    case 3:
                        System.out.println("Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Error: Invalid option. Please try again.");
                }
            } else {
                System.out.println("\nWelcome, " + logInUser.getName() + "!");
                System.out.println("1: Show Details");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Check Balance");
                System.out.println("5: Logout");
                System.out.print("Choose an option: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Error: Please enter a valid number.");
                    sc.next(); // Clear invalid input
                    continue;
                }

                int entry = sc.nextInt();
                switch (entry) {
                    case 1:
                        logInUser.showDetails();
                        break;
                    case 2:
                        System.out.print("Enter Withdraw Amount: ");
                        if (!sc.hasNextDouble()) {
                            System.out.println("Error: Invalid amount.");
                            sc.next();
                            continue;
                        }
                        logInUser.withdraw(sc.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter Deposit Amount: ");
                        if (!sc.hasNextDouble()) {
                            System.out.println("Error: Invalid amount.");
                            sc.next();
                            continue;
                        }
                        logInUser.deposit(sc.nextDouble());
                        break;
                    case 4:
                        logInUser.balance();
                        break;
                    case 5:
                        logInUser = null;
                        System.out.println("Logged out successfully!");
                        break;
                    default:
                        System.out.println("Error: Invalid option. Please try again.");
                }
            }
        }
    }
}


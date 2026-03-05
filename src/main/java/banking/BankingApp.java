package banking;
import java.util.*;
public class BankingApp {
    static double balance;
    static ArrayList<String> transactionHistory = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Account Type: ");
        String accountType = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = CheckDouble();

        int choice;
        do {
            printMenu();
            choice = CheckInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;

                case 2:
                    withdraw();
                    break;

                case 3:
                    printBalance();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 4);
        sc.close();
    }

    public static void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = CheckDouble();
        if (validateAmount(amount)) {
            balance += amount;
            transactionHistory.add("Deposited: " + String.format("%.2f", amount));
            System.out.println("Deposit successful.");
            printBalance();
            printTransactionLog();
        }
    }

    public static void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        double amount = CheckDouble();
        if (!validateAmount(amount)) return;
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + String.format("%.2f", amount));
            System.out.println("Withdrawal successful.");
            printBalance();
            printTransactionLog();
        }
    }

    public static void printMenu() {
        System.out.println("\n--- Banking Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    public static void printBalance() {
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    public static boolean validateAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Must be greater than 0.");
            return false;
        }
        return true;
    }

    public static void printTransactionLog() {
        System.out.println("\nTransaction Log:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }

    public static double CheckDouble() {
    while (!sc.hasNextDouble()) {
        System.out.print("Invalid input. Enter a number: ");
        sc.next(); 
    }
        return sc.nextDouble();
    }

    public static int CheckInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter an integer: ");
            sc.next(); 
        }
        return sc.nextInt();
    }
}
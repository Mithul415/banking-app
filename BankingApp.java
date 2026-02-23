import java.util.*;

public class BankingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter account type: ");
        String accountType = sc.nextLine();

        System.out.print("Enter current balance: ");
        double initialBalance = sc.nextDouble();

        Account acc = new Account(customerName, accountNumber, accountType, initialBalance);

        System.out.println("\nAccount Summary");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        printBalance(acc);

        int choice;
        boolean running = true;

        while(running){

            printMenu();
            if(!sc.hasNextInt()){
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();
            switch(choice){

                case 1:
                    System.out.print("Enter amount to deposit: ");

                    if(!sc.hasNextDouble()){
                        System.out.println("Invalid input! Please enter a numeric value.");
                        sc.next();
                        break;
                    }
                    double depositAmount = Math.abs(sc.nextDouble());
                    if(validateAmount(depositAmount)){
                        acc.deposit(depositAmount);
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    if(!sc.hasNextDouble()){
                        System.out.println("Invalid input! Please enter a numeric value.");
                        sc.next();
                        break;
                    }
                    double withdrawAmount = Math.abs(sc.nextDouble());
                    if(validateAmount(withdrawAmount)){
                        acc.withdraw(withdrawAmount);
                    }
                    break;

                case 3:
                    System.out.println("\nTransaction History:");
                    acc.showTransactionHistory();
                    break;

                case 4:
                    System.out.println("Thank you for using the banking app!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
    
    public static void printMenu(){
        System.out.println("\nMenu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. View Transaction History");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void printBalance(Account acc){
        acc.showBalance();
    }

    public static boolean validateAmount(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount! Must be greater than 0.");
            return false;
        }
        return true;
    }
}
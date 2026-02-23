import java.util.ArrayList;

public class Account {
    private ArrayList<String> transactionHistory;
    private String customerName;
    private String accountNumber;
    private String accountType;
    private double balance;
    

    public Account(String customerName, String accountNumber, String accountType, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount! Must be greater than 0.");
        }
        else {
            balance += amount;
            System.out.printf("New Balance: %.2f%n", balance);
            transactionHistory.add("Deposited: " + amount);
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount! Must be greater than 0.");
        }
        else if(amount > balance){
            System.out.println("Insufficient funds!");
        }
        else {
            balance -= amount;
            System.out.printf("New Balance: %.2f%n", balance);
            transactionHistory.add("Withdrawn: " + amount);
        }
    }

    public void showTransactionHistory(){

        if(transactionHistory.isEmpty()){
            System.out.println("No transactions yet.");
        }
        else {
            for(String t : transactionHistory){
                System.out.println(t);
            }
        }
    }

    public void showBalance(){
        System.out.printf("Current Balance: %.2f%n", balance);
    }
}

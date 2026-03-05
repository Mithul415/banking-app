package banking;
import java.util.*;

public abstract class BankAccount implements Transactable, Printable{
    protected String accountNumber;
    protected double balance;
    protected String owner;
    protected List<Transaction> transactions;

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        Transaction t = new Transaction(
        "T" + (transactions.size() + 1),
        TransactionType.DEPOSIT,
        amount,
        "Deposit"
        );  
    transactions.add(t);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        Transaction t = new Transaction(
        "T" + (transactions.size() + 1),
        TransactionType.WITHDRAW,
        amount,
        "Withdraw"
        );
    transactions.add(t);
    }

    @Override
    public void printStatement() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }

    @Override
    public String toString() {
        return "AccountNumber=" + accountNumber + ", Owner=" + owner + ", Balance=" + balance;
    }
}

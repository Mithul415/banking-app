package banking;
import java.util.*;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, String owner, double initialBalance, double interestRate) {
        super(accountNumber, owner, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = balance * interestRate;
        balance += interest;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + "accountNumber='" + accountNumber + '\'' + ", owner='" + owner + '\'' + ", balance=" + balance + ", interestRate=" + interestRate + '}';
    }   
}

package banking;
import java.util.*;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String owner, double initialBalance, double overdraftLimit ){
        super(accountNumber, owner, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" + "accountNumber='" + accountNumber + '\'' + ", owner='" + owner + '\'' + ", balance=" + balance + ", overdraftLimit=" + overdraftLimit + '}';
    }
}

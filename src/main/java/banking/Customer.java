package banking;
import java.util.*;

public class Customer {
    private String name;
    private String customerId;
    private String email;
    private List<BankAccount> accounts;

    public Customer(String name, String customerId, String email){
        this.name = name;
        this.customerId = customerId;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public void displayAccount(){
        for(BankAccount acc : accounts){
            System.out.println(acc);
        }
    }

    public String getName(){
        return name;
    }

    public String getCustomerId(){
        return customerId;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", customerId='" + customerId + '\'' + ", email='" + email + '\'' + ", accounts=" + accounts + '}';
    }
}

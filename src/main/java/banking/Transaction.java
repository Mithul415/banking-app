package banking;
import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private TransactionType type;
    private double amount;
    private LocalDateTime timestamp;
    private String description;

    public Transaction(String transactionId, TransactionType type, double amount, String description) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Type: " + type + ", Amount: " + amount + ", Time: " + timestamp + ", Description: " + description;
    }
}


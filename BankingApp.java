public class BankingApp {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java BankingApp <customerName> <accountNumber> <accountType> <balance>");
            return;
        }
        String customerName = args[0];
        String accountNumber = args[1];
        String accountType = args[2];
        double balance = Double.parseDouble(args[3]);

        System.out.println("Account Summary");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.printf("Current Balance: %.2f%n", balance);
    }
}
package banking;

public class Main {

    public static void main(String[] args) {

        SavingsAccount acc = new SavingsAccount(
                "ACC101",
                "Mithul",
                1000,
                0.05
        );

        acc.deposit(500);
        acc.withdraw(200);

        acc.printStatement();
    }
}
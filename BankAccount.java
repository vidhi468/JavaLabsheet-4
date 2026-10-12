public class BankAccount {
    private String holderName;
    private double balance;   // only changeable through deposit()

    BankAccount(String holderName, double openingBalance) {
        this.holderName = holderName;
        this.balance = openingBalance >= 0 ? openingBalance : 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs. " + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount: " + amount + " (must be positive).");
        }
    }

    void display() {
        System.out.println("Account Holder : " + holderName);
        System.out.println("Balance        : Rs. " + balance);
    }
}

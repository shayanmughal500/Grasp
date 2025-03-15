class BankAccount {
    private double balance;
    private String accountType;

    public BankAccount(double balance, String accountType) {
        this.balance = balance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountType + " Account: Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (accountType.equals("Savings")) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Savings Account: Withdrawn $" + amount);
            } else {
                System.out.println("Insufficient balance in Savings Account!");
            }
        } else if (accountType.equals("Current")) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Current Account: Withdrawn $" + amount);
            } else {
                System.out.println("Overdraft Not Allowed in Current Account!");
            }
        } else {
            System.out.println("Unknown account type!");
        }
    }

    public void showBalance() {
        System.out.println(accountType + " Account Balance: $" + balance);
    }
}

// Main Class
public class withoutprinciple {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount(1000, "Savings");
        BankAccount current = new BankAccount(2000, "Current");

        savings.deposit(500);
        savings.withdraw(1200);
        savings.showBalance();

        current.deposit(1000);
        current.withdraw(3500);
        current.showBalance();
    }
}

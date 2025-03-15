// Base class (Superclass)
abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Subclass 1 - Savings Account
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings Account: Deposited $" + amount);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings Account: Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }
}

// Subclass 2 - Current Account
class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current Account: Deposited $" + amount);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Current Account: Withdrawn $" + amount);
        } else {
            System.out.println("Overdraft Not Allowed in Current Account!");
        }
    }
}

// Main Class
public class withprinciple {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        BankAccount current = new CurrentAccount(2000);

        savings.deposit(500);
        savings.withdraw(1200);
        savings.showBalance();

        current.deposit(1000);
        current.withdraw(3500);
        current.showBalance();
    }
}

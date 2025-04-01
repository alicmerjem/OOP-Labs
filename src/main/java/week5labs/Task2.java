package week5labs;

public class Task2 {
    public static void main(String[] args) {

    }

}

// BankAccount class
class BankAccount {
    // adding private fields
    private String accountNumber;
    private String ownerName;
    private double balance;

    // constructors created
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    // no setter for balance
    public double getBalance() {
        return balance;
    }

    // deposit method
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(ownerName + " deposited " + amount + ". New balance: " + balance);
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(ownerName + " withdrew " + amount + ". New balance:" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public String toString() {
        return "Account type: BankAccount | Ownder: " + ownerName + ", Balance: " + balance;
    }

}

// SavingsAccount class
class SavingsAccount extends BankAccount {
    private double interestRate;

    // constructors
    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    // interest method
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest applied. New balance: " + getBalance());
    }

    @Override
    public String toString() {
        return "Account type: SavingsAccount | Owner: " + getOwnerName();
    }
}

// CheckingAccount class
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    // constructors
    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // override withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() + overdraftLimit >= amount) {
            double newBalance = getBalance() - amount;
            System.out.println(getOwnerName() + " withdrew " + amount + ". New balance: " + newBalance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }

    @Override
    public String toString() {
        return "Account Type: CheckingAccount | Owner: " + getOwnerName() + ", Balance: " + getBalance() + ". Overdraft limit: " + overdraftLimit;
    }
}
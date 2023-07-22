package bank;

public class BankAccount {
    private String accountName;
    private double balance;
    private final String accountNumber;

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String accountName, double balance, String accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("?");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("??");
        }
        if (amount > balance) {
            throw new IllegalStateException("csoro");
        }
        balance -= amount;
    }

    public void transfer(BankAccount targetAccount, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("???");
        }
        if (amount > balance) {
            throw new IllegalStateException("smh");
        }
        withdraw(amount);
        targetAccount.deposit(amount);
    }
}

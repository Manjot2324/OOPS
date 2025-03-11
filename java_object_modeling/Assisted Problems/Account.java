import java.util.*;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println("Account: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        Account account1 = new Account("12345", 1000.0);
        Account account2 = new Account("67890", 2000.0);

        bank.openAccount(customer1, account1);
        bank.openAccount(customer2, account2);

        customer1.viewBalance();
        customer2.viewBalance();

        account1.deposit(500);
        account2.withdraw(300);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}

class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer customer, Account account) {
        customer.openAccount(account);
    }
}

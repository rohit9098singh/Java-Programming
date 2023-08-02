import java.util.*;

class Account {
    private int accountId;
    private double balance;

    public Account(int accountId) {
        this.accountId = accountId;
        this.balance = 0.0;
    }

    // ... (getter and setter methods for accountId and balance)

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class Customer {
    private String name;
    private Account account;

    public Customer(String name, int accountId) {
        this.name = name;
        this.account = new Account(accountId);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}

public class ch0_bank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()

        List<Customer> customers = new ArrayList<>();

        for (int i = 0; i < numCustomers; i++) {
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();

            System.out.print("Enter account ID for " + name + ": ");
            int accountId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()

            Customer customer = new Customer(name, accountId);
            customers.add(customer);
        }

        for (Customer customer : customers) {
            System.out.print("Enter deposit amount for " + customer.getName() + ": ");
            double depositAmount = scanner.nextDouble();
            customer.getAccount().deposit(depositAmount);

            System.out.print("Enter withdrawal amount for " + customer.getName() + ": ");
            double withdrawalAmount = scanner.nextDouble();
            if (customer.getAccount().withdraw(withdrawalAmount)) {
                System.out.println(customer.getName() + " withdrew " + withdrawalAmount);
            } else {
                System.out.println("Insufficient balance for " + customer.getName() + " to withdraw " + withdrawalAmount);
            }
        }

        System.out.println("\nAccount Information:");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            System.out.println("Account ID: " + customer.getAccount().getAccountId());
            System.out.println("Balance: " + customer.getAccount().getBalance());
            System.out.println();
        }
    }
}


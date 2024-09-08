import java.util.Scanner;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
            System.out.println("UPDATED BALANCE OF YOUR ACCOUNT IS : "+getBalance());
            System.out.println("\n============================================================================");
        } else {
            System.out.println("Invalid deposit amount.");
            System.out.println("\n============================================================================");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
            System.out.println("UPDATED BALANCE OF YOUR ACCOUNT IS : "+getBalance());
            System.out.println("\n============================================================================");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            System.out.println("\n============================================================================");
        }
    }
}


class ATM {
    Scanner sc = new Scanner(System.in);
    private final BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void start() {

        while (true) {

            System.out.println("\nWELCOME TO THE BANK OF INDIA ATM.\n\n");
            System.out.println("HOW CAN WE HELP YOU ?\nPLEASE LET US KNOW YOUR DESIRED OPTION,PRESS ANY OPTION BELOW.\n");
            System.out.println("1. CHECK YOUR ACCOUNT'S BALANCE");
            System.out.println("2. WANNA DEPOSIT MONEY");
            System.out.println("3. WANNA WITHDRAW MONEY");
            System.out.println("4. I AM GOOD TO GO. EXIT");

            System.out.print("\nPlease provide your option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> depositMoney(sc);
                case 3 -> withdrawMoney(sc);
                case 4 -> {
                    System.out.println("Thank you for using the BANK OF INDIA ATM. We wish you to visit again..!😊");
                    System.out.println("\n============================================================================");
                    return;
                }
                default -> {
                    System.out.println("Invalid option. Please try again.");
                    System.out.println("\n============================================================================");
                }
            }
        }
    }

    private void checkBalance() {
        System.out.println("Your account has a current balance of: " + account.getBalance());
        System.out.println("\n============================================================================");
    }

    private void depositMoney(Scanner sc) {
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    private void withdrawMoney(Scanner sc) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }
}



public class task3_ATM_Interface {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000.0);
        ATM atm = new ATM(myAccount);
        atm.start();

    }
}
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialbalance) {
        this.balance = initialbalance;
    }

    public double getbalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposit of $" + amount + "successful. current balance : $" + balance);
        } else {
            System.out.println("invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw of $" + amount + "successful.current balance: $" + balance);
        } else {
            System.out.println("invalid withdrawal amount or insufficiant balance.");
        }
    }

}

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displaymenu() {
        System.out.println("ATM Menu :");
        System.out.println("1. check Balance");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. exit");
    }

    public void performtransaction(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                System.out.println("current balance: $" + bankAccount.getbalance());
                break;

            case 2:
                System.out.println("enter deposit amount : $");
                double depositAmount = scanner.nextDouble();
                bankAccount.deposit(depositAmount);
                break;

            case 3:
                System.out.println("enter withdrawal amount: $");
                double withdrawalAmount = scanner.nextDouble();
                bankAccount.withdraw(withdrawalAmount);
                break;

            case 4:
                System.out.println("exiting ATM . thank you !");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("invalid choice.please select a valid option");

        }
    }
}

public class ATM_interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter initial account balance: $");
        double initialbalance = scanner.nextDouble();
        BankAccount bankAccount = new BankAccount(initialbalance);

        ATM atm = new ATM(bankAccount);
        while (true) {
            atm.displaymenu();
            System.out.print("select an option :");
            int choice = scanner.nextInt();

            atm.performtransaction(choice, scanner);
        }

    }
}

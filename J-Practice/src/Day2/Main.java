package Day2;

import java.util.Scanner;

class Customer {
    private int actNo;
    private String name;
    private double balance;
    private String accType;

    // Constructor
    public Customer(int actNo, String name, double balance, String accType) {
        this.actNo = actNo;
        this.name = name;
        this.balance = balance;
        this.accType = accType;
    }

    // Getter methods
    public int getActNo() {
        return actNo;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // ToString method for printing details
    public String toString() {
        return "Account No: " + actNo + ", Name: " + name + ", Balance: " + balance + ", Type: " + accType;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer users[] = new Customer[5];
        users[0] = new Customer(101, "Asha", 1000, "Saving");
        users[1] = new Customer(102, "Ajay", 12000, "Current");
        users[2] = new Customer(103, "Pooja", 13000, "Saving");
        users[3] = new Customer(104, "Kavita", 14000, "Saving");
        users[4] = new Customer(105, "Ravi", 15000, "Current");

        System.out.println("Enter the account number:");
        int act = sc.nextInt();

        int ind = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getActNo() == act) {
                System.out.println(users[i].toString());
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            System.out.println("Account Not Found");
            return;
        }

        // Deposit Process
        System.out.print("Enter deposit amount: ");
        int amount = sc.nextInt();
        users[ind].setBalance(users[ind].getBalance() + amount);
        System.out.println("Deposit updated: " + users[ind].toString());

        // Withdrawal Process
        System.out.print("Enter the amount for withdrawal: ");
        int withdrawAmount = sc.nextInt();
        if (withdrawAmount > users[ind].getBalance()) {
            System.out.println("Insufficient balance!");
        } else {
            users[ind].setBalance(users[ind].getBalance() - withdrawAmount);
            System.out.println("Amount withdrawn, your balance is: " + users[ind].getBalance());
        }

        // Transfer Process
        System.out.print("Enter transfer account number: ");
        int transacc = sc.nextInt();
        System.out.print("Enter amount to be transferred: ");
        int tamt = sc.nextInt();

        int transferInd = -1;
        for (int j = 0; j < users.length; j++) {
            if (users[j].getActNo() == transacc) {
                transferInd = j;
                break;
            }
        }

        if (transferInd == -1) {
            System.out.println("Transfer account not found!");
        } else if (tamt > users[ind].getBalance()) {
            System.out.println("Insufficient balance for transfer!");
        } else {
            users[ind].setBalance(users[ind].getBalance() - tamt);
            users[transferInd].setBalance(users[transferInd].getBalance() + tamt);
            System.out.println("Transfer successful!");
            System.out.println("Your updated balance: " + users[ind].getBalance());
            System.out.println("Recipient's updated balance: " + users[transferInd].getBalance());
        }

        sc.close(); // Close scanner
    }
}

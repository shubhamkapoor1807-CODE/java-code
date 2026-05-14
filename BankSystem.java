import java.util.Scanner;

public class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("===== BANK SYSTEM =====");

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();

        balance = balance + deposit;

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {

            balance = balance - withdraw;

            System.out.println("Withdrawal Successful");

        } else {

            System.out.println("Insufficient Balance");
        }

        System.out.println("Final Balance: " + balance);

        sc.close();
    }
}
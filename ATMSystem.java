import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("===== ATM SYSTEM =====");

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("Balance = " + balance);

        } else if (choice == 2) {

            System.out.print("Enter Amount: ");
            int deposit = sc.nextInt();

            balance = balance + deposit;

            System.out.println("New Balance = " + balance);

        } else if (choice == 3) {

            System.out.print("Enter Amount: ");
            int withdraw = sc.nextInt();

            if (withdraw <= balance) {

                balance = balance - withdraw;

                System.out.println("Remaining Balance = " + balance);

            } else {

                System.out.println("Insufficient Balance");
            }

        } else {

            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
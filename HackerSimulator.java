import java.util.Random;
import java.util.Scanner;

public class HackerSimulator {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int security = 100;

        System.out.println("===== HACKER SIMULATOR =====");

        while (security > 0) {

            System.out.println("\nSystem Security: " + security);

            System.out.println("1. SQL Injection");
            System.out.println("2. Brute Force Attack");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int hack = random.nextInt(25) + 10;

                security = security - hack;

                System.out.println("SQL Injection Success -" + hack);

            } else if (choice == 2) {

                int hack = random.nextInt(40) + 5;

                security = security - hack;

                System.out.println("Brute Force Damage -" + hack);

            } else {

                break;
            }

            Thread.sleep(1000);
        }

        if (security <= 0) {

            System.out.println("\nSystem Hacked Successfully!");
        }

        sc.close();
    }
}
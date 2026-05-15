import java.util.Random;
import java.util.Scanner;

public class TreasureHunt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int treasure = random.nextInt(5) + 1;

        System.out.println("===== TREASURE HUNT =====");

        System.out.println("Choose A Box Between 1 To 5");

        System.out.print("Enter Box Number: ");
        int choice = sc.nextInt();

        if (choice == treasure) {

            System.out.println("You Found The Treasure!");

        } else {

            System.out.println("Wrong Box");
            System.out.println("Treasure Was In Box " + treasure);
        }

        sc.close();
    }
}
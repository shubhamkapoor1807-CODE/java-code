import java.util.Scanner;

public class HorrorEscapeGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int health = 100;

        System.out.println("===== HORROR ESCAPE GAME =====");
        System.out.println("You Wake Up Inside A Haunted House");

        while (health > 0) {

            System.out.println("\nHealth: " + health);

            System.out.println("1. Open Dark Door");
            System.out.println("2. Run Upstairs");
            System.out.println("3. Search For Weapon");
            System.out.println("4. Escape");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("A Ghost Attacked You!");
                health = health - 20;

            } else if (choice == 2) {

                System.out.println("You Fell Down The Stairs!");
                health = health - 15;

            } else if (choice == 3) {

                System.out.println("You Found A Knife");
                health = health + 10;

            } else if (choice == 4) {

                System.out.println("You Escaped Successfully!");
                break;

            } else {

                System.out.println("Invalid Choice");
            }
        }

        if (health <= 0) {

            System.out.println("\nYou Died In The Haunted House");
        }

        sc.close();
    }
}
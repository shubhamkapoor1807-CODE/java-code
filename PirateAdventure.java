import java.util.Random;
import java.util.Scanner;

public class PirateAdventure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int gold = 100;
        int health = 100;

        System.out.println("===== PIRATE ADVENTURE =====");

        while (health > 0) {

            System.out.println("\nHealth: " + health);
            System.out.println("Gold: " + gold);

            System.out.println("1. Search Treasure");
            System.out.println("2. Fight Enemy Ship");
            System.out.println("3. Rest");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int treasure = random.nextInt(200) + 50;

                gold = gold + treasure;

                System.out.println("Treasure Found: " + treasure);

            } else if (choice == 2) {

                int damage = random.nextInt(40) + 10;

                health = health - damage;

                gold = gold + 100;

                System.out.println("Battle Damage: " + damage);

            } else if (choice == 3) {

                health = health + 20;

                System.out.println("Health Restored");

            } else {

                break;
            }
        }

        System.out.println("Pirate Journey Ended");
        sc.close();
    }
}
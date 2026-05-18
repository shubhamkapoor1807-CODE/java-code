import java.util.Random;
import java.util.Scanner;

public class ApocalypseSurvival {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int food = 100;
        int health = 100;
        int zombies = 20;

        System.out.println("===== APOCALYPSE SURVIVAL =====");

        while (health > 0 && zombies > 0) {

            System.out.println("\nHealth: " + health);
            System.out.println("Food: " + food);
            System.out.println("Zombies Left: " + zombies);

            System.out.println("1. Search Food");
            System.out.println("2. Fight Zombies");
            System.out.println("3. Rest");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int supplies = random.nextInt(30) + 10;

                food = food + supplies;

                System.out.println("Food Found: " + supplies);

            } else if (choice == 2) {

                int killed = random.nextInt(5) + 1;

                zombies = zombies - killed;

                int damage = random.nextInt(25) + 5;

                health = health - damage;

                System.out.println("Zombies Killed: " + killed);
                System.out.println("Damage Taken: " + damage);

            } else {

                health = health + 15;
                food = food - 10;

                System.out.println("You Rested");
            }

            food = food - 5;

            if (food <= 0) {

                health = health - 10;
            }
        }

        if (health > 0) {

            System.out.println("\nYou Survived The Apocalypse!");

        } else {

            System.out.println("\nYou Died!");
        }

        sc.close();
    }
}
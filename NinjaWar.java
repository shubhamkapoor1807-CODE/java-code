import java.util.Random;
import java.util.Scanner;

public class NinjaWar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int ninja = 100;
        int enemy = 120;

        System.out.println("===== NINJA WAR =====");

        while (ninja > 0 && enemy > 0) {

            System.out.println("\nNinja Health: " + ninja);
            System.out.println("Enemy Health: " + enemy);

            System.out.println("1. Katana Attack");
            System.out.println("2. Throw Shuriken");
            System.out.println("3. Heal");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int damage = random.nextInt(25) + 5;

                enemy = enemy - damage;

                System.out.println("Katana Damage: " + damage);

            } else if (choice == 2) {

                int damage = random.nextInt(35) + 5;

                enemy = enemy - damage;

                System.out.println("Shuriken Damage: " + damage);

            } else {

                int heal = random.nextInt(20) + 10;

                ninja = ninja + heal;

                System.out.println("Health Restored By " + heal);
            }

            int enemyAttack = random.nextInt(20) + 1;

            ninja = ninja - enemyAttack;

            System.out.println("Enemy Attacked For " + enemyAttack);
        }

        if (ninja > 0) {

            System.out.println("\nEnemy Defeated!");

        } else {

            System.out.println("\nNinja Lost The Battle!");
        }

        sc.close();
    }
}
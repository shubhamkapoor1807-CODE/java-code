import java.util.Random;
import java.util.Scanner;

public class DemonHunter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int hunter = 100;
        int demon = 150;

        System.out.println("===== DEMON HUNTER =====");

        while (hunter > 0 && demon > 0) {

            System.out.println("\nHunter Health: " + hunter);
            System.out.println("Demon Health: " + demon);

            System.out.println("1. Sword Slash");
            System.out.println("2. Magic Attack");
            System.out.println("3. Heal");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int damage = random.nextInt(20) + 5;

                demon = demon - damage;

                System.out.println("Sword Damage: " + damage);

            } else if (choice == 2) {

                int damage = random.nextInt(35) + 10;

                demon = demon - damage;

                System.out.println("Magic Damage: " + damage);

            } else {

                int heal = random.nextInt(20) + 5;

                hunter = hunter + heal;

                System.out.println("Health Restored By " + heal);
            }

            int demonAttack = random.nextInt(25) + 1;

            hunter = hunter - demonAttack;

            System.out.println("Demon Attacked For " + demonAttack);
        }

        if (hunter > 0) {

            System.out.println("\nDemon Defeated!");

        } else {

            System.out.println("\nHunter Was Destroyed!");
        }

        sc.close();
    }
}
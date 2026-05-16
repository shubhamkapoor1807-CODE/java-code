import java.util.Random;
import java.util.Scanner;

public class VampireHunter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int hunter = 100;
        int vampire = 120;

        System.out.println("===== VAMPIRE HUNTER =====");

        while (hunter > 0 && vampire > 0) {

            System.out.println("\nHunter Health: " + hunter);
            System.out.println("Vampire Health: " + vampire);

            System.out.println("1. Silver Sword");
            System.out.println("2. Holy Water");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            int damage = random.nextInt(25) + 1;

            if (choice == 1) {

                vampire = vampire - damage;

                System.out.println("Sword Damage: " + damage);

            } else {

                vampire = vampire - (damage + 10);

                System.out.println("Holy Water Damage: " + (damage + 10));
            }

            int vampireAttack = random.nextInt(20) + 1;

            hunter = hunter - vampireAttack;

            System.out.println("Vampire Attacked For " + vampireAttack);
        }

        if (hunter > 0) {

            System.out.println("\nVampire Destroyed!");

        } else {

            System.out.println("\nHunter Defeated!");
        }

        sc.close();
    }
}
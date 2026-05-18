import java.util.Random;
import java.util.Scanner;

public class DarkWizard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int wizard = 100;
        int monster = 140;
        int mana = 50;

        System.out.println("===== DARK WIZARD =====");

        while (wizard > 0 && monster > 0) {

            System.out.println("\nWizard Health: " + wizard);
            System.out.println("Mana: " + mana);
            System.out.println("Monster Health: " + monster);

            System.out.println("1. Fireball");
            System.out.println("2. Lightning Spell");
            System.out.println("3. Recharge Mana");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1 && mana >= 10) {

                int damage = random.nextInt(25) + 10;

                monster = monster - damage;
                mana = mana - 10;

                System.out.println("Fireball Damage: " + damage);

            } else if (choice == 2 && mana >= 20) {

                int damage = random.nextInt(40) + 15;

                monster = monster - damage;
                mana = mana - 20;

                System.out.println("Lightning Damage: " + damage);

            } else {

                mana = mana + 15;

                System.out.println("Mana Recharged");
            }

            int monsterAttack = random.nextInt(20) + 5;

            wizard = wizard - monsterAttack;

            System.out.println("Monster Attack: " + monsterAttack);
        }

        if (wizard > 0) {

            System.out.println("\nMonster Destroyed!");

        } else {

            System.out.println("\nWizard Was Defeated!");
        }

        sc.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class MonsterDungeon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int player = 100;
        int monster = 80;

        System.out.println("===== MONSTER DUNGEON =====");

        while (player > 0 && monster > 0) {

            System.out.println("\nPlayer Health: " + player);
            System.out.println("Monster Health: " + monster);

            System.out.println("1. Attack");
            System.out.println("2. Heal");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int attack = random.nextInt(30) + 1;

                monster = monster - attack;

                System.out.println("You Hit Monster For " + attack);

            } else {

                int heal = random.nextInt(20) + 1;

                player = player + heal;

                System.out.println("You Healed " + heal);
            }

            int monsterAttack = random.nextInt(20) + 1;

            player = player - monsterAttack;

            System.out.println("Monster Hit You For " + monsterAttack);
        }

        if (player > 0) {

            System.out.println("\nMonster Defeated!");

        } else {

            System.out.println("\nYou Were Defeated!");
        }

        sc.close();
    }
}
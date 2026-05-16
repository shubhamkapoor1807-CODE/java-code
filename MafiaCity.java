import java.util.Random;
import java.util.Scanner;

public class MafiaCity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int money = 500;
        int health = 100;

        System.out.println("===== MAFIA CITY =====");

        while (health > 0) {

            System.out.println("\nHealth: " + health);
            System.out.println("Money: " + money);

            System.out.println("1. Rob Bank");
            System.out.println("2. Buy Weapon");
            System.out.println("3. Fight Gang");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int cash = random.nextInt(500) + 100;

                money = money + cash;

                System.out.println("You Stole " + cash);

            } else if (choice == 2) {

                if (money >= 200) {

                    money = money - 200;

                    System.out.println("Weapon Purchased");

                } else {

                    System.out.println("Not Enough Money");
                }

            } else if (choice == 3) {

                int damage = random.nextInt(30) + 1;

                health = health - damage;

                System.out.println("Gang Fight Damage: " + damage);

            } else {

                break;
            }
        }

        System.out.println("Game Over");
        sc.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class AlienInvasion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int cityHealth = 100;

        System.out.println("===== ALIEN INVASION =====");

        while (cityHealth > 0) {

            System.out.println("\nCity Health: " + cityHealth);

            System.out.println("1. Shoot Aliens");
            System.out.println("2. Build Shield");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int kills = random.nextInt(20) + 1;

                System.out.println("You Destroyed " + kills + " Aliens");

            } else {

                cityHealth = cityHealth + 10;

                System.out.println("Shield Increased City Health");
            }

            int alienAttack = random.nextInt(25) + 1;

            cityHealth = cityHealth - alienAttack;

            System.out.println("Aliens Damaged City By " + alienAttack);
        }

        System.out.println("\nCity Destroyed");
        sc.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class SpaceWar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int spaceship = 100;
        int aliens = 150;

        System.out.println("===== SPACE WAR =====");

        while (spaceship > 0 && aliens > 0) {

            System.out.println("\nSpaceship Health: " + spaceship);
            System.out.println("Alien Army: " + aliens);

            System.out.println("1. Laser Attack");
            System.out.println("2. Repair Ship");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int attack = random.nextInt(40) + 10;

                aliens = aliens - attack;

                System.out.println("You Destroyed " + attack + " Aliens");

            } else {

                int repair = random.nextInt(20) + 5;

                spaceship = spaceship + repair;

                System.out.println("Ship Repaired By " + repair);
            }

            int alienAttack = random.nextInt(25) + 1;

            spaceship = spaceship - alienAttack;

            System.out.println("Aliens Attacked You For " + alienAttack);
        }

        if (spaceship > 0) {

            System.out.println("\nYou Saved The Galaxy!");

        } else {

            System.out.println("\nGalaxy Destroyed!");
        }

        sc.close();
    }
}
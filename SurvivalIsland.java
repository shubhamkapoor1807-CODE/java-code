import java.util.Random;
import java.util.Scanner;

public class SurvivalIsland {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int hunger = 100;
        int energy = 100;

        System.out.println("===== SURVIVAL ISLAND =====");

        while (hunger > 0 && energy > 0) {

            System.out.println("\nHunger: " + hunger);
            System.out.println("Energy: " + energy);

            System.out.println("1. Hunt Food");
            System.out.println("2. Sleep");
            System.out.println("3. Explore");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int food = random.nextInt(30) + 10;

                hunger = hunger + food;

                System.out.println("You Found Food +" + food);

            } else if (choice == 2) {

                energy = energy + 20;

                System.out.println("Energy Restored");

            } else {

                int danger = random.nextInt(25) + 1;

                energy = energy - danger;

                hunger = hunger - 15;

                System.out.println("Exploration Damage: " + danger);
            }

            hunger = hunger - 10;
            energy = energy - 5;
        }

        System.out.println("\nYou Could Not Survive");
        sc.close();
    }
}
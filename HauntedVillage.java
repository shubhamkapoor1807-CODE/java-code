import java.util.Random;
import java.util.Scanner;

public class HauntedVillage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int sanity = 100;

        System.out.println("===== HAUNTED VILLAGE =====");

        while (sanity > 0) {

            System.out.println("\nSanity Level: " + sanity);

            System.out.println("1. Explore House");
            System.out.println("2. Light Torch");
            System.out.println("3. Run Away");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                int fear = random.nextInt(30) + 10;

                sanity = sanity - fear;

                System.out.println("Ghost Fear Damage: " + fear);

            } else if (choice == 2) {

                sanity = sanity + 10;

                System.out.println("Torch Increased Courage");

            } else {

                System.out.println("You Escaped The Village");
                break;
            }

            if (sanity <= 0) {

                System.out.println("\nYou Lost Your Mind!");
            }
        }

        sc.close();
    }
}
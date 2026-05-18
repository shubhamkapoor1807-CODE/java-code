import java.util.Scanner;

public class UnderworldEscape {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int progress = 0;

        System.out.println("===== UNDERWORLD ESCAPE =====");

        while (progress < 100) {

            System.out.println("\nEscape Progress: " + progress + "%");

            System.out.println("1. Cross Lava Bridge");
            System.out.println("2. Solve Ancient Puzzle");
            System.out.println("3. Fight Demon Guard");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                progress = progress + 25;

                System.out.println("You Crossed The Bridge");

            } else if (choice == 2) {

                progress = progress + 35;

                System.out.println("Puzzle Solved");

            } else if (choice == 3) {

                progress = progress + 20;

                System.out.println("Guard Defeated");

            } else {

                System.out.println("Invalid Choice");
            }
        }

        System.out.println("\nYou Escaped The Underworld!");
        sc.close();
    }
}
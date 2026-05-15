import java.util.Random;
import java.util.Scanner;

public class SnakeGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int snakePosition = 1;
        int foodPosition = random.nextInt(10) + 1;

        System.out.println("===== MINI SNAKE GAME =====");

        while (true) {

            System.out.println("\nSnake Position: " + snakePosition);
            System.out.println("Food Position: " + foodPosition);

            System.out.println("1. Move Forward");
            System.out.println("2. Move Backward");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                snakePosition++;

            } else if (choice == 2) {

                snakePosition--;

            } else {

                break;
            }

            if (snakePosition == foodPosition) {

                System.out.println("Snake Ate The Food!");

                foodPosition = random.nextInt(10) + 1;
            }

            if (snakePosition < 1) {
                snakePosition = 1;
            }

            if (snakePosition > 10) {
                snakePosition = 10;
            }
        }

        sc.close();
    }
}
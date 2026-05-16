import java.util.Random;
import java.util.Scanner;

public class CasinoGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int money = 1000;

        System.out.println("===== CASINO GAME =====");

        while (money > 0) {

            System.out.println("\nCurrent Money: " + money);

            System.out.print("Enter Bet Amount: ");
            int bet = sc.nextInt();

            int player = random.nextInt(10) + 1;
            int casino = random.nextInt(10) + 1;

            System.out.println("Your Number: " + player);
            System.out.println("Casino Number: " + casino);

            if (player > casino) {

                money = money + bet;

                System.out.println("You Won!");

            } else {

                money = money - bet;

                System.out.println("You Lost!");
            }

            if (money <= 0) {

                System.out.println("Game Over");
            }
        }

        sc.close();
    }
}
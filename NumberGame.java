import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = 5;
        int guess;

        System.out.println("===== NUMBER GAME =====");

        do {

            System.out.print("Guess Number Between 1 To 10: ");
            guess = sc.nextInt();

            if (guess > secret) {

                System.out.println("Too High");

            } else if (guess < secret) {

                System.out.println("Too Low");

            } else {

                System.out.println("Correct Number");
            }

        } while (guess != secret);

        sc.close();
    }
}
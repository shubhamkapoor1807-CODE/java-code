import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("===== EVEN ODD CHECKER =====");

        System.out.print("Enter Number: ");
        number = sc.nextInt();

        if (number % 2 == 0) {

            System.out.println("Even Number");

        } else {

            System.out.println("Odd Number");
        }

        sc.close();
    }
}
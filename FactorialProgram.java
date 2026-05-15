import java.util.Scanner;

public class FactorialProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int factorial = 1;

        System.out.println("===== FACTORIAL PROGRAM =====");

        System.out.print("Enter Number: ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}
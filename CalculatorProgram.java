import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;

        System.out.println("===== CALCULATOR =====");

        System.out.print("Enter First Number: ");
        a = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        b = sc.nextDouble();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {

            System.out.println("Division = " + (a / b));

        } else {

            System.out.println("Division By Zero Not Allowed");
        }

        sc.close();
    }
}
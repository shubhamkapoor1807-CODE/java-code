import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double units;
        double bill;

        System.out.println("===== ELECTRICITY BILL =====");

        System.out.print("Enter Units Consumed: ");
        units = sc.nextDouble();

        if (units <= 100) {

            bill = units * 5;

        } else if (units <= 200) {

            bill = (100 * 5) + ((units - 100) * 7);

        } else {

            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Total Bill = " + bill);

        sc.close();
    }
}
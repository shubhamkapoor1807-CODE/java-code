import java.util.Scanner;

public class FloydTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows;
        int number = 1;

        System.out.println("===== FLOYD TRIANGLE =====");

        System.out.print("Enter Number Of Rows: ");
        rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }

        sc.close();
    }
}
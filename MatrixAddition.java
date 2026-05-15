import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];

        System.out.println("===== MATRIX ADDITION =====");

        System.out.println("Enter First Matrix:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Result Matrix:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(sum[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}